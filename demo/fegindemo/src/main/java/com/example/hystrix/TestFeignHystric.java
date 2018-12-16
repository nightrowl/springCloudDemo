package com.example.hystrix;

import com.example.service.TestFeign;
import org.springframework.stereotype.Component;

@Component
public class TestFeignHystric implements TestFeign {

    @Override
   public String testChooseOneClient(String name){
        return name + " got error ,return Hystric method";
    }

}

