package com.example.bffcsmartcity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.example.bffcsmartcity.client")
public class BffCSmartCityApplication {
    public static void main(String[] args) {
        SpringApplication.run(BffCSmartCityApplication.class, args);
    }
}

