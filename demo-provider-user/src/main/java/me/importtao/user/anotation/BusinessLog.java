package me.importtao.user.anotation;

import me.importtao.user.enums.BusinessLogTypeEnum;

import java.lang.annotation.*;

/**
 * @program spring-cloud-parent
 * @description: 业务日志
 * @author: changhu
 * @create: 2019/08/17 18:20
 */
@Target({ElementType.METHOD,ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface BusinessLog {
    String key();
    BusinessLogTypeEnum type() default BusinessLogTypeEnum.USER;
    String description ();
}
