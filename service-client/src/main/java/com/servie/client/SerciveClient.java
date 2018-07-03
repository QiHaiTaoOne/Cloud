package com.servie.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SerciveClient {
    public static void main(String[] args) {
        SpringApplication.run(SerciveClient.class, args);
        System.out.print("======================项目启动成功：==============================");
    }
}