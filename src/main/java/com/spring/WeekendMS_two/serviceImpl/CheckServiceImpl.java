package com.spring.WeekendMS_two.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Component
public class CheckServiceImpl {
	
	@Autowired
	private RestTemplate restTemp;
	
	@HystrixCommand(fallbackMethod = "checkFallback")
	public String getDataFromMS1() {
		String entity = restTemp.getForObject("http://localhost:8080/checkmsone", String.class);
		return entity;
	}
	
	public String checkFallback() {
		return "This is from fallback method";
	}
	
	@Bean
	public RestTemplate restTempMethod() {
		return new RestTemplate();
	}
	

}
