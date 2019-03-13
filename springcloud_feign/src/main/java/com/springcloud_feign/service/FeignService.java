package com.springcloud_feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name="springcloud-member")
public interface FeignService {

    @RequestMapping("/member/port/")
    public String getPort();
}
