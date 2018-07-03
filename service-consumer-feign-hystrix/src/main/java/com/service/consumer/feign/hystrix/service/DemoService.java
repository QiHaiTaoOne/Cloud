package com.service.consumer.feign.hystrix.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DemoService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "ribbonError")
    public String ribbon(String name) {
        return name + "----" +restTemplate.getForObject("http://service-client/demo", String.class);
    }

    public String ribbonError(String name) {
        return "hi,"+name+",sorry, net error!";
    }
}
