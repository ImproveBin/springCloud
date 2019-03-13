package com.springcloud_ribbon.service.impl;

import com.springcloud_ribbon.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class RibbonServiceImpl implements RibbonService {

    private final static String URL = "http://SPRINGCLOUD-MEMBER";

    @Autowired
    private RestTemplate restTemplate;
    @Override
    public String getMemberPort() {
        return restTemplate.getForObject(URL+"/member/port/",String.class);
    }
}
