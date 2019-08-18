package me.importtao.user;

/**
 * @program spring-cloud-parent
 * @description: 业务日志类型枚举
 * @author: changhu
 * @create: 2019/08/17 18:21
 */

public enum BusinessLogTypeEnum {
    USER(1,"USER"),CLASS(2,"CLASS");

    private int code;
    private String name;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    BusinessLogTypeEnum(int code, String name) {
        this.code = code;
        this.name = name;
    }}
