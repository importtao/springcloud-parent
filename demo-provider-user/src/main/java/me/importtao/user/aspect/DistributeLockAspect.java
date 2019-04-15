package me.importtao.user.aspect;

import lombok.extern.slf4j.Slf4j;
import me.importtao.user.anotation.DistributeLock;
import me.importtao.user.config.RedisLock;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

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
    @Pointcut("execution(public * me.importtao.user.controller..*.*(..))")
    public void doMethod(){}

    @Around("doMethod()")
    public void doAround(ProceedingJoinPoint joinPoint)throws Throwable,InterruptedException{
        log.info("进入切面");
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        Optional<DistributeLock> distributeLockOptional = Optional.ofNullable(method.getAnnotation(DistributeLock.class));
        final Object result;
        if(!distributeLockOptional.isPresent()){
           return ;
        }
        distributeLockOptional.ifPresent(distributeLock->{
            String key = distributeLock.key();
            String requestedId = UUID.randomUUID().toString();
            while (true){
                if(redisLock.tryLock(key, requestedId,distributeLock.expire(), TimeUnit.MILLISECONDS)){
                    try{
                        joinPoint.proceed();
                    }catch (Throwable e){
                        e.printStackTrace();
                    }finally {
                        redisLock.releaseLock(key,requestedId);
                    }
                    break;
                }else{
                    /**获取锁失败线程休眠1秒后重试*/
                    try{
                        Thread.sleep(1000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                        log.error("线程休眠调度失败");
                    }
                }
            }
        });
        joinPoint.proceed();
    }

    public static void main(String[] args) {
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
