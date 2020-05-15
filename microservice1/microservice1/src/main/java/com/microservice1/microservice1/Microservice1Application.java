package com.microservice1.microservice1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableDiscoveryClient
@SpringBootApplication
public class Microservice1Application {

	public static void main(String[] args) {
		SpringApplication.run(Microservice1Application.class, args);
	}

}


@RestController
//@RequestMapping(value = "/ms-1")
class Microservice1RestController {

	
	@RequestMapping(value = "/microservice1")
	public String greeting() {
		return "<body><h1><font color='red'>Hello from microservice 1</font></h1></body>	";
	}
}