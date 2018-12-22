package com.example.register_client2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class RegisterClient2Application {

    public static void main(String[] args) {
        SpringApplication.run(RegisterClient2Application.class, args);
    }

}

