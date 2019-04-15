package me.importtao.user.anotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @program spring-cloud-parent
 * @description: 分布式锁
 * @author: changhu
 * @create: 2019/04/15 20:46
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface DistributeLock {
    String key();

    /**超时时间 */
    long expire() default 3000;
}
