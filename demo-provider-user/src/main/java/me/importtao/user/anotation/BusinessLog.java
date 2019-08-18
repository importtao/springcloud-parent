package me.importtao.user.anotation;

import me.importtao.user.BusinessLogTypeEnum;

/**
 * @program spring-cloud-parent
 * @description: 业务日志
 * @author: changhu
 * @create: 2019/08/17 18:20
 */
public @interface BusinessLog {
    String key = null;
    BusinessLogTypeEnum type = null;
    String valueKey = null;
}
