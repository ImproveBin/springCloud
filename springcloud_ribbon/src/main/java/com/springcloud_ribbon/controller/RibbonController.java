package com.springcloud_ribbon.controller;

import com.springcloud_ribbon.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RibbonController {

    @Autowired
    private RibbonService ribbonService;

    @RequestMapping("/ribbon/port/")
    public String getMemberPort() {
        return ribbonService.getMemberPort();
    }
}
