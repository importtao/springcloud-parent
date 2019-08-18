package me.importtao.user.anotation;


import java.lang.annotation.*;

/**
 * @program spring-cloud-parent
 * @description: 分布式锁
 * @author: changhu
 * @create: 2019/04/15 20:46
 */
@Target({ElementType.METHOD,ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface DistributeLock {
    String key();

    /**超时时间 */
    long expire() default 3000;
}
