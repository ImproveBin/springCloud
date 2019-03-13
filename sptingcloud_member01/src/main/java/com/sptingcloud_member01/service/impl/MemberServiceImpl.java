package com.sptingcloud_member01.service.impl;


import com.sptingcloud_member01.service.MemberService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {

    @Value("${server.port}")
    private String PORT;

    public String getPort() {
        return PORT;
    }
}
