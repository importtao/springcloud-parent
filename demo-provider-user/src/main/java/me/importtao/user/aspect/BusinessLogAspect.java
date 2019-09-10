package me.importtao.user.aspect;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import me.importtao.user.anotation.BusinessLog;
import me.importtao.user.common.BusinessLogAbstract;
import me.importtao.user.config.RedisLock;
import me.importtao.user.dao.PlanetSysOperationLogMapper;
import me.importtao.user.enums.BusinessLogTypeEnum;
import me.importtao.user.enums.LogKeyEnum;
import me.importtao.user.model.PlanetSysOperationLog;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.Date;
import java.util.Optional;

/**
 * @program spring-cloud-parent
 * @description: 业务日志切面
 * @author: changhu
 * @create: 2019/08/17 18:28
 */
@Slf4j
@Aspect
@Component
public class BusinessLogAspect {
    @Autowired
    RedisLock redisLock;
    @Autowired
    PlanetSysOperationLogMapper planetSysOperationLogMapper;

    static final String fieldName = "threadLocal";

    @Pointcut("@annotation(me.importtao.user.anotation.BusinessLog)")
    public void tartMethod(){}

    @After("tartMethod()")
    public void doHandler(JoinPoint joinPoint) throws Throwable{
        /*try {
            proceedingJoinPoint.proceed();
        } catch (Throwable throwable) {
            throw throwable;
        }*/
        Object targetObject = joinPoint.getTarget();
        if(targetObject instanceof BusinessLogAbstract){
            MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
            Method method = methodSignature.getMethod();
            Optional<BusinessLog> businessLogOptional = Optional.ofNullable(method.getAnnotation(BusinessLog.class));
            if(!businessLogOptional.isPresent()){
                /*try {
                    return proceedingJoinPoint.proceed();
                } catch (Throwable throwable) {
                    throw throwable;
                }*/
                return;
            }
            BusinessLog businessLog = businessLogOptional.get();
            String description = businessLog.description();
            BusinessLogTypeEnum typeEnum = businessLog.type();
            BusinessLogAbstract businessLogAbstract = (BusinessLogAbstract) targetObject;
            PlanetSysOperationLog planetSysOperationLog = new PlanetSysOperationLog();
            planetSysOperationLog.setOperationDescription(description);
            planetSysOperationLog.setOperationType(typeEnum.getName());
            planetSysOperationLog.setCreateTime(new Date());
            try {
                String ch = String.valueOf(businessLogAbstract.mGet(LogKeyEnum.CHANGED_ID).orElse(null));
                String em = String.valueOf(businessLogAbstract.mGet(LogKeyEnum.ERROR_MESSAGE).orElse(null));
                Object nv = businessLogAbstract.mGet(LogKeyEnum.NEW_VALUE).orElse(null);
                Object ov = businessLogAbstract.mGet(LogKeyEnum.OLD_VALUE).orElse(null);
                String oui = String.valueOf(businessLogAbstract.mGet(LogKeyEnum.OPERATOR_USER_ID).orElse(null));
                String re = String.valueOf(businessLogAbstract.mGet(LogKeyEnum.RESULT).orElse(null));
                planetSysOperationLog.setChangedId(ch);
                planetSysOperationLog.setErrorMessage(em);
                planetSysOperationLog.setNewData(JSON.toJSONString(nv));
                planetSysOperationLog.setOldData(JSON.toJSONString(ov));
                planetSysOperationLog.setOperatorUserId(oui);
                planetSysOperationLog.setResult(re);
            } catch (ClassCastException e) {
                e.printStackTrace();
            }
            log.info("log:[{}]", planetSysOperationLog);
            planetSysOperationLogMapper.insert(planetSysOperationLog);



        }else{
            log.error("不是实现类 do nothing");
        }
        /*try {
            Optional<Field> fieldOptional = Optional.ofNullable(targetObject.getClass().getDeclaredField("threadLocal"));
            fieldOptional.ifPresent(field -> {
                try {
                    ThreadLocal<Map> valueThreadLocal =  (ThreadLocal<Map>) field.get(targetObject);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            });
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }*/


        return;

    }
}
