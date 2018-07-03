package com.servie.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    DiscoveryClient discoveryClient;

    @GetMapping("/demo")
    public String demo() {
        String services = "Services: " + discoveryClient.getServices();
        System.out.println(services);
        return services;
    }

    @GetMapping("/name")
    public String name(@RequestParam String name) {
        return "-----------------:" + name;
    }
}
