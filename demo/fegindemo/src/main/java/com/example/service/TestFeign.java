package com.example.service;

import com.example.hystrix.TestFeignHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-demo",fallback = TestFeignHystric.class)
public interface TestFeign {
    @RequestMapping(value = "/sayHello",method = RequestMethod.GET)
   public String testChooseOneClient(@RequestParam(value = "name") String name);
}
