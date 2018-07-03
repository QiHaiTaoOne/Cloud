package com.cloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceEureka {

    public static void main(String[] args) {
        SpringApplication.run(ServiceEureka.class, args);
        System.out.print("======================项目启动成功：==============================");

    }
}