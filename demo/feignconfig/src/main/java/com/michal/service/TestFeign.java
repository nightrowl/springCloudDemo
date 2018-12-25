package com.michal.service;

import com.config.FeignConfig;
import com.michal.domain.User;
import com.michal.hystrix.TestFeignHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-demo", fallback = TestFeignHystric.class, configuration = FeignConfig.class)
public interface TestFeign {

    @RequestMapping(value = "/api/demo/testLog", method = RequestMethod.GET)
    public String testLog(@RequestParam String name);


    @RequestMapping(value="/api/demo/testMoreParams",method = RequestMethod.POST)
    public String testMoreParams(@RequestBody User user);

    @RequestMapping(value="/api/demo/testMoreParamsGet",method = RequestMethod.GET)
    public String testMoreParamsGet(@RequestParam("name")String name , @RequestParam("age") String age);
}
