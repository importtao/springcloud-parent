package me.importtao.user.aspect;

import lombok.extern.slf4j.Slf4j;
import me.importtao.user.common.BusinessLogAbstract;
import me.importtao.user.config.RedisLock;
import me.importtao.user.enums.LogKeyEnum;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.util.Map;
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
    static final String fieldName = "threadLocal";

    @Pointcut("@annotation(me.importtao.user.anotation.BusinessLog)")
    public void tartMethod(){}

    @Around("tartMethod()")
    public Object doHandler(ProceedingJoinPoint proceedingJoinPoint){
        try {
            proceedingJoinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        Object targetObject = proceedingJoinPoint.getTarget();
        if(targetObject instanceof BusinessLogAbstract){
            BusinessLogAbstract businessLogAbstract = (BusinessLogAbstract) targetObject;
            log.info("old:[{}]", businessLogAbstract.mGet(LogKeyEnum.OLD_VALUE).get());
            log.info("new:[{}]", businessLogAbstract.mGet(LogKeyEnum.NEW_VALUE).get());
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


        return null;

    }
}
