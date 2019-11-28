package com.dutytrail.backend.duty.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({
        "com.dutytrail.backend.duty.app.controller",
        "com.dutytrail.backend.duty.domain.service",
        "com.dutytrail.backend.duty.domain.dao"
})
@EnableDiscoveryClient
@SpringBootApplication
public class DutyApp {

    public static void main(String[] args) {
        SpringApplication.run(DutyApp.class, args);
    }
}