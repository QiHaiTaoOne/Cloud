package com.service.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
public class ServiceConsumer {

    public static void main(String[] args) {
        SpringApplication.run(ServiceConsumer.class, args);
        System.out.print("======================项目服务消费方启动成功：==============================");
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}