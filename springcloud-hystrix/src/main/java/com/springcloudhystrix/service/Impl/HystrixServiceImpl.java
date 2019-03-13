package com.springcloudhystrix.service.Impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.springcloudhystrix.service.HystrixService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class HystrixServiceImpl implements HystrixService {


    @Value("${server.port}")
    private String port;

    @HystrixCommand(fallbackMethod = "processHystrix_Port")
    public String getPort() {
        System.out.println("impl getPort");
        if (null != port){
           throw  new RuntimeException("port = "+port);
        }
        return port;
    }

    public String processHystrix_Port() {
        System.out.println("in processHystrix_Port");

        return "processHystrix_Port";
    }
}
