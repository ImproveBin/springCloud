package com.springcloud_ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
//@RibbonClient(name = "SPRINGCLOUD_MEMBER")
public class SpringcloudRibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudRibbonApplication.class, args);
	}

}

