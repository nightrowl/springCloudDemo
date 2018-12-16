package com.michal.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Value("${server.port}")
    String port;
    @RequestMapping("/sayHello")
    public String test(@RequestParam String name){

        return "hi i am " + name + port  + ": hello everyOne";
    }
    @RequestMapping("/testZuul")
    public String zuul(@RequestParam String name){

        return "this is demo service , from " + port ;
    }
}
