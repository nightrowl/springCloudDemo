package com.michal.hystrix;

import com.michal.domain.User;
import com.michal.service.TestFeign;
import org.springframework.stereotype.Component;

@Component
public class TestFeignHystric implements TestFeign {


    @Override
    public String testLog(String name) {
        return null;
    }

    @Override
    public String testMoreParams(User user) {
        return null;
    }

    @Override
    public String testMoreParamsGet(String name, String age) {
        return null;
    }
}

