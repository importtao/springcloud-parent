package me.importtao.feign.feignClient;

import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "demo-provider-user")
public interface TestFeignClient {
    @RequestMapping("/{id}")
    public String findByIdFeign(@RequestParam("id") Long id);

}
