package com.test.service.a.serviceinterface;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "SERVICE-B")
public interface ServiceB {


    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index();
}
