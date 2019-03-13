package com.springcloud_feign.controller;

import com.springcloud_feign.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {
    @Autowired
    private FeignService feignService;

    @RequestMapping("/feign/port/")
    public String getPort(){

        return feignService.getPort();
    }

}
