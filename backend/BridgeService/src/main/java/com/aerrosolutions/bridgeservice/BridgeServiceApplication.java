package com.aerrosolutions.bridgeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BridgeServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BridgeServiceApplication.class, args);
    }

}
