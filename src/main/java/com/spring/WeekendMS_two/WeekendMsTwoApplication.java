package com.spring.WeekendMS_two;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableEurekaClient
@SpringBootApplication
@EnableHystrix
@EnableFeignClients
public class WeekendMsTwoApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeekendMsTwoApplication.class, args);
	}

}
