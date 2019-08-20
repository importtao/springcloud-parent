package me.importtao.user.enums;

public enum LogKeyEnum {

    OLD_VALUE(1,"OLD_VALUE","oldValueKey","旧值"),
    NEW_VALUE(1,"NEW_VALUE","newValueKey","新值"),
    OPERATOR_USER_ID(1,"OPERATOR_USER_ID","operatorUserId","操作人id"),
    RESULT(1,"RESULT","result","操作结果"),
    ERROR_MESSAGE(1,"ERROR_MESSAGE","errorMessage","错误信息"),
    CHANGED_ID(1,"CHANGED_ID","changedId","被操作数据id");


    private int code;
    private String key;
    private String name;
    private String description;

    LogKeyEnum(int code, String key, String name, String description) {
        this.code = code;
        this.key = key;
        this.name = name;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
