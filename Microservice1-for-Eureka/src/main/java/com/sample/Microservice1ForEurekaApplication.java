package com.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Microservice1ForEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(Microservice1ForEurekaApplication.class, args);
	}

}
