package me.importtao.user.common;

import me.importtao.user.enums.LogKeyEnum;

import javax.validation.constraints.NotNull;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public interface BusinessLogAbstract {
    ThreadLocal<Map> threadLocal = new ThreadLocal<>();


    

    default BusinessLogAbstract mSet(@NotNull LogKeyEnum keyEnum, Object object){
        Map threadLocalValue = Optional.ofNullable(threadLocal.get()).orElseGet(HashMap::new);
        threadLocalValue.put(keyEnum.getKey(),object);
        threadLocal.set(threadLocalValue);
        return this;
    }

    default <T> Optional<T> mGet(@NotNull LogKeyEnum keyEnum){
        Optional<Map> threadLocalValueOptional = Optional.ofNullable(threadLocal.get());
        if(threadLocalValueOptional.isPresent()){
            return (Optional<T>)Optional.ofNullable(threadLocalValueOptional.get().get(keyEnum.getKey()));
        }
        return Optional.empty();
    }
}
