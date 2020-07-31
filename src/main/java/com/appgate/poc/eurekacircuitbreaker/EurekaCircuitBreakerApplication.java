package com.appgate.poc.eurekacircuitbreaker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaCircuitBreakerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaCircuitBreakerApplication.class, args);
    }

}
