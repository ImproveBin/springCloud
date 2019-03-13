package com.springcloud_member03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringcloudMember03Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudMember03Application.class, args);
	}

}

