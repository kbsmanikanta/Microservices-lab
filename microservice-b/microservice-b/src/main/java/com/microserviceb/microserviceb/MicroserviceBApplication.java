package com.microserviceb.microserviceb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableDiscoveryClient
@EnableEurekaClient
@SpringBootApplication
@RestController
@RequestMapping(value = "//ms-b")
public class MicroserviceBApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceBApplication.class, args);
	}


	@RequestMapping(value = "/greeting")
	public String greeting() {
		return "<h1> HELLO FROM MICRO - B</h1>";
	}

}
