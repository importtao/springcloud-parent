package me.importtao.user.aspect;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import me.importtao.user.anotation.DistributeLock;
import me.importtao.user.anotation.DistributeLockKey;
import me.importtao.user.config.RedisLock;
import me.importtao.user.util.ReflexObjectUtil;
import org.apache.ibatis.javassist.ClassClassPath;
import org.apache.ibatis.javassist.ClassPool;
import org.apache.ibatis.javassist.CtClass;
import org.apache.ibatis.javassist.CtMethod;
import org.apache.ibatis.javassist.bytecode.CodeAttribute;
import org.apache.ibatis.javassist.bytecode.LocalVariableAttribute;
import org.apache.ibatis.javassist.bytecode.MethodInfo;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

/**
 * @program spring-cloud-parent
 * @description: 添加分布式锁切面
 * @author: changhu
 * @create: 2019/04/15 21:29
 */
@Slf4j
@Aspect
@Component
public class DistributeLockAspect {
    @Autowired
    RedisLock redisLock;
    @Pointcut("@annotation(me.importtao.user.anotation.DistributeLock)")
    public void doMethod(){}

    @Around("doMethod()")
    public Object doAround(ProceedingJoinPoint joinPoint)throws Throwable{
        log.info("进入切面");
        Map<String,Object> map = new HashMap<>(16);
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        Optional<DistributeLock> distributeLockOptional = Optional.ofNullable(method.getAnnotation(DistributeLock.class));
        Optional<DistributeLockKey> distributeLockKeyOptional = Optional.ofNullable(method.getAnnotation(DistributeLockKey.class));
        if(!distributeLockOptional.isPresent()){
            return joinPoint.proceed();
        }
        StringBuilder keyStringBuilder = new StringBuilder();
        distributeLockKeyOptional.ifPresent(distributeLockKey -> {
            try{
                Map<String,Class<?>> paramClassMap = new HashMap<>(16);
                Map<String,Object> paramMap = getFieldsNameValueMap(joinPoint,paramClassMap);
                Stream<String> paramStream = Stream.of(distributeLockKey.params());
                paramStream.forEach(paramExpresion->{
                    String [] expresions = paramExpresion.split("\\.");
                    Optional<Object> valueObject = Optional.ofNullable(paramMap.get(expresions[0]));
                    valueObject.ifPresent(value->{
                        if(expresions.length < 2){
                            keyStringBuilder.append(":"+ JSON.toJSONString(value));
                        }else{
                            for(int i=1;i<expresions.length;i++){
                                value = ReflexObjectUtil.getValueByKey(value,expresions[i]);
                            }
                            keyStringBuilder.append(":"+ JSON.toJSONString(value));
                        }
                    });

                });
            }catch (Exception e){
                log.error("参数获取异常");
            }
        });
        distributeLockOptional.ifPresent(distributeLock->{
            keyStringBuilder.append(":"+distributeLock.key());
            String key = keyStringBuilder.toString();
            String requestedId = UUID.randomUUID().toString();
            while (true){
                if(redisLock.tryLock(key, requestedId,distributeLock.expire(), TimeUnit.MILLISECONDS)){
                    try{
                        log.info(key+"获取锁成功");
                        map.put("result",joinPoint.proceed());
                    }catch (Throwable e){
                        e.printStackTrace();
                    }finally {
                        redisLock.releaseLock(key,requestedId);
                        log.info(key+"释放锁");
                    }
                    break;
                }else{
                    /**获取锁失败线程休眠0.1秒后重试*/
                    try{
                        Thread.sleep(100);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                        log.error("线程休眠调度失败");
                    }
                }
            }
        });
        return map.get("result");
    }

    private Map<String,Object> getFieldsNameValueMap(JoinPoint joinPoint,Map<String,Class<?>> paramClassMap) throws Exception {
        /**@description  aop获取方法的参数名和值集合
         * @param [joinPoint]
         * @return java.util.Map<java.lang.String,java.lang.Object>
         * @author changhu
         * @date 2019-04-28
         */
        Object[] args = joinPoint.getArgs();
        String classType = joinPoint.getTarget().getClass().getName();
        Class<?> clazz = Class.forName(classType);
        String clazzName = clazz.getName();
        String methodName = joinPoint.getSignature().getName();
        Map<String,Object > map=new HashMap<>(16);
        ClassPool pool = ClassPool.getDefault();
        ClassClassPath classPath = new ClassClassPath(this.getClass());
        pool.insertClassPath(classPath);
        CtClass cc = pool.get(clazzName);
        CtMethod cm = cc.getDeclaredMethod(methodName);
        MethodInfo methodInfo = cm.getMethodInfo();
        CodeAttribute codeAttribute = methodInfo.getCodeAttribute();
        LocalVariableAttribute attr = (LocalVariableAttribute) codeAttribute.getAttribute(LocalVariableAttribute.tag);
        if (attr == null) {
            throw new RuntimeException();
        }
        int pos = Modifier.isStatic(cm.getModifiers()) ? 0 : 1;
        for (int i = 0; i < cm.getParameterTypes().length; i++){
            paramClassMap.put(attr.variableName(i + pos),args[i].getClass());
            map.put( attr.variableName(i + pos),args[i]);
        }
        return map;
    }

    public static void main(String[] args) {
        String a = "asd.asd";
        String[] s = a.split("\\.");
        List<Long> list =new ArrayList<>();
        list.add(1L);
        list.add(2L);
        list.add(3L);
        list.add(4L);
        list.add(5L);
        list.add(6L);
        list.add(7L);
        list.stream().forEach(n->{
            System.out.println(n);
            if(1==1){
                return;
            }
            System.out.println("aaa");
        });
        System.out.println("test");
    }
}
