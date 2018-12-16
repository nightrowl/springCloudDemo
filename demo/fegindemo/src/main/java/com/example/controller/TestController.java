package com.example.controller;

import com.example.service.TestFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    TestFeign testFeign;

    @Value("${server.port}")
    String port;

    @RequestMapping("/testOne")
    public String testFeign(@RequestParam String name ){
       return  testFeign.testChooseOneClient(name);
    }


    @RequestMapping("/testZuul")
    public String zuul(@RequestParam String name){

        return "this is feign service , from " + port ;
    }
}
