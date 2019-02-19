package me.importtao.ribbon.service;

import me.importtao.ribbon.entity.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TestService {
    @Autowired
    private RestTemplate restTemplate;
    public String findById(Long id) {
// http://服务提供者的serviceId/url
        return this.restTemplate.getForObject("http://demo-provider-user/" + id, String.class);
    }
}
