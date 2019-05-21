package com.test.service.b;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ServiceBApplication {


    public static void main(String[] arge) {
        SpringApplication.run(ServiceBApplication.class, arge);
    }
}
