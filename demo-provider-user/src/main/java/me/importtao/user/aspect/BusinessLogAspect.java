package me.importtao.user.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @program spring-cloud-parent
 * @description: 业务日志切面
 * @author: changhu
 * @create: 2019/08/17 18:28
 */
@Aspect
public class BusinessLogAspect {

    @Pointcut("@annotation(me.importtao.user.anotation.DistributeLock)")
    public void tartMethod(){}

    @Around("tartMethod()")
    public Object doHandler(ProceedingJoinPoint proceedingJoinPoint){
        Object targetObject = proceedingJoinPoint.getTarget();
        targetObject.getClass().getTypeParameters();

    }
}
