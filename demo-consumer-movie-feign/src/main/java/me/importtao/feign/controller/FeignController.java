package me.importtao.feign.controller;

import me.importtao.feign.feignClient.TestFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {
    @Autowired
    private TestFeignClient testFeignClient;
    @GetMapping("feign/{id}")
    public String findByIdFeign(@PathVariable Long id) {
        String str = this.testFeignClient.findByIdFeign(id);
        return str;
    }
}