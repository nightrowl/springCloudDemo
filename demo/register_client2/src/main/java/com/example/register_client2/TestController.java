package com.example.register_client2;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class TestController {

    @Autowired
    DiscoveryClient discoveryClient;

    @RequestMapping("/showInfo")
    public List<ServiceInstance> showInfo() {

        return discoveryClient.getInstances("eureka-server2");
    }

}
