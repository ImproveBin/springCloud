package com.springcloudhystrix.controller;

import com.springcloudhystrix.service.HystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HystrixController {

    @Autowired
    public HystrixService hystrixService;

    @RequestMapping("/hystrix/port")
    public String getPort(){


        return hystrixService.getPort();
    }
}
