package com.service.consumer.feign.controller;

import com.service.consumer.feign.service.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ConsumerController {

    @Resource
    DemoService demoService;

    @GetMapping("/feign")
    public String feign(@RequestParam String name) {
        return name + "-----" + demoService.demo();
    }
}
