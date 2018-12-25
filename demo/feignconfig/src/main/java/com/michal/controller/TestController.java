package com.michal.controller;


import com.michal.domain.User;
import com.michal.service.TestFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    TestFeign testFeign;

    @Value("${server.port}")
    String port;

    @RequestMapping("/testFeign")
    public String testFeign(@RequestParam String name ){

       return  testFeign.testLog(name);
    }

    @RequestMapping("/testMoreParams")
    public String testMoreParams(@RequestBody User user ){

        return  testFeign.testMoreParams(user);
    }

    @RequestMapping("/testMoreParamsGet")
    public String testMoreParamsGet(@RequestParam("name")String name , @RequestParam("age") String age){

        return  testFeign.testMoreParamsGet(name,age);
    }

    @RequestMapping("/testZuul")
    public String zuul(@RequestParam String name){

        return "this is feign service , from " + port ;
    }
}
