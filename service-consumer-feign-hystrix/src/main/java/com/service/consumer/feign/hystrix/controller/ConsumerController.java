package com.service.consumer.feign.hystrix.controller;

import com.service.consumer.feign.hystrix.service.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
public class ConsumerController {

    @Resource
    DemoService demoService;

    @GetMapping("/ribbon")
    public String ribbon(@RequestParam String name) {
        return demoService.ribbon(name);
    }
}
