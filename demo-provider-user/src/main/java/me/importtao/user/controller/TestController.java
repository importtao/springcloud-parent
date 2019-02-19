package me.importtao.user.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import me.importtao.user.dao.TestDao;
import me.importtao.user.entity.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {
    @Autowired
    private DiscoveryClient discoveryClient;
    @Autowired
    private TestDao testDao;
    /**
     * 注：@GetMapping("/{id}")是spring 4.3的新注解等价于：
     * @RequestMapping(value = "/id", method = RequestMethod.GET)
     * 类似的注解还有@PostMapping等等
     * @param id
     * @return user信息
     */
    @GetMapping("/{id}")
    public String findById(@PathVariable Long id) {
        return "hello";
    }
    /**
     * 本地服务实例的信息
     * @return
     */
    @GetMapping("/instance-info")
    public String showInfo() {
        //ServiceInstance localServiceInstance = this.discoveryClient.getLocalServiceInstance();
        return this.discoveryClient.description();
    }
}
