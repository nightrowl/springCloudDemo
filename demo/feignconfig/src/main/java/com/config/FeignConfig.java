package com.config;



import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {

    @Bean
    Logger.Level feginConfig(){
        return  Logger.Level.FULL;
    }
}
