package com.tutorialq.eurekaclientsubject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaClientSubjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientSubjectApplication.class, args);
    }
}
