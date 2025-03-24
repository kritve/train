package com.example.zuulproxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ZuulproxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulproxyApplication.class, args);
	}

}
