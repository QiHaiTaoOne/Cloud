package com.service.consumer.feign.service;

import com.service.consumer.feign.service.hystrix.DemoServiceHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient(value = "eureka-client", fallback = DemoServiceHystrix.class)
public interface DemoService {

    @GetMapping(value= "/demo")
    String demo();
}
