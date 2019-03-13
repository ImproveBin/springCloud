package com.springcloud_member02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringcloudMember02Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudMember02Application.class, args);
	}

}

