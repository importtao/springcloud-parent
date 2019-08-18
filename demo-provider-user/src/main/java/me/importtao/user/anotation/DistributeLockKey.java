package me.importtao.user.anotation;

import me.importtao.user.functionalInterface.KeyHandler;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @program spring-cloud-parent
 * @description: 分布式锁动态key 获取request参数动态生成key
 * @author: changhu
 * @create: 2019/04/22 20:41
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface DistributeLockKey {
    String[] params();
}
