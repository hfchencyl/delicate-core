package com.cd.delicate.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class DelicateCoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(DelicateCoreApplication.class, args);
    }

}
