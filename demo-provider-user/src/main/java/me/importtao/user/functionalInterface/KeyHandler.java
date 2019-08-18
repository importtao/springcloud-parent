package me.importtao.user.functionalInterface;

import java.lang.reflect.Method;

/**
 * @program spring-cloud-parent
 * @description: 根据参数生成key
 * @author: changhu
 * @create: 2019/04/28 21:25
 */
@FunctionalInterface
public interface KeyHandler {
    String getKey(Method method);
}
