package com.springcloud_member02.controller;


import com.springcloud_member02.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MemberController {

    @Autowired
    private MemberService memberService;

    @RequestMapping(value = "/member/port/")
    public String getPort() {
        System.out.println("member port ："+ memberService.getPort());
        return memberService.getPort();
    }
}
