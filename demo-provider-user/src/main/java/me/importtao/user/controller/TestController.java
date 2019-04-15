package me.importtao.user.controller;

import lombok.extern.slf4j.Slf4j;
import me.importtao.user.anotation.DistributeLock;
import me.importtao.user.config.RedisLock;
import me.importtao.user.dao.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@Slf4j
@RestController
public class TestController {
    @Autowired
    private DiscoveryClient discoveryClient;
    @Autowired
    private RedisLock redisLock;
    @Autowired
    private TestMapper testMapper;
    /**
     * 注：@GetMapping("/{id}")是spring 4.3的新注解等价于：
     * @RequestMapping(value = "/id", method = RequestMethod.GET)
     * 类似的注解还有@PostMapping等等
     * @param id
     * @return user信息
     */
    @GetMapping("/{id}")
    public String findById(@PathVariable Long id) throws InterruptedException{
        while (true){
            if(redisLock.tryLock("findById","1",3000, TimeUnit.MILLISECONDS)){
                log.info("id:{}获取锁成功，执行任务",id);
                Thread.sleep(1000);

                redisLock.releaseLock("findById","1");
                break;
            }else{
                Thread.sleep(1000);
            }
        }
        return "hello";
    }

    @DistributeLock(key = "testNoLock")
    @GetMapping("/testNoLock/{id}")
    public String testNoLock(@PathVariable Long id) throws InterruptedException{
        Thread.sleep(1000);
        log.info("id:{}获取锁成功，执行任务",id);
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
