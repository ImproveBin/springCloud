package com.springcloud_member02.service.impl;

import com.springcloud_member02.service.MemberService;
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
