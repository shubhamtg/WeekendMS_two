package com.spring.WeekendMS_two;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.WeekendMS_two.MS1Calls.MS1Interface;
import com.spring.WeekendMS_two.serviceImpl.CheckServiceImpl;

@RestController
public class MyController {
	
	@Value("${message:hello MS_Two}")
	private String message;
	
	@Autowired
	private CheckServiceImpl checkService;
	
	@GetMapping("/checkmstwo")
	public String check() {
		return message;
	}
	
	@GetMapping("/callMs1")
	public String callMs1() {
		return checkService.getDataFromMS1();
	}
	
	@Autowired
	private MS1Interface reference;
	
	@GetMapping("/callMS1UsingFeign")
	public String callMS1UsingFeign() {
		return reference.fetchDataFromMS1();
	}
}
