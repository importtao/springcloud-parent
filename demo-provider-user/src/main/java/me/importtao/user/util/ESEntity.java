package me.importtao.user.util;

import lombok.Data;

/**
 * @program spring-cloud-parent
 * @description:
 * @author: changhu
 * @create: 2019/11/14 14:43
 */
@Data
public final class ESEntity<T> {
    private String id;
    private T data;

    public ESEntity(String id,T data){
        super();
        this.id = id;
        this.data = data;
    }
}
