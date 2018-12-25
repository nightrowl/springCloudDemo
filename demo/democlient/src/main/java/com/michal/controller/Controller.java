package com.michal.controller;

import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @Value("${server.port}")
    String port;

    @RequestMapping("/sayHello")
    public String test(@RequestParam String name) {

        return "hi i am " + name + port + ": hello everyOne";
    }

    @RequestMapping("/testZuul")
    public String zuul(@RequestParam String name) {

        return "this is demo service , from " + port;
    }


    @GetMapping("/api/demo/testLog")
    public String testLog(@RequestParam String name){
        return "this is feign config :" + name;
    }

    @RequestMapping("/api/demo/testMoreParams")
    public String testMoreParams(@RequestBody JSONObject jsonObject){
        System.out.println(jsonObject);
        return jsonObject.toString();
    }

    @RequestMapping("/api/demo/testMoreParamsGet")
    public String testMoreParamsGet(@RequestParam("name") String name ,@RequestParam("age") String age){
        System.out.println("name :" + name  + ",age :" + age);
        return name + age ;
    }
}