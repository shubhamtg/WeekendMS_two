package com.spring.WeekendMS_two.MS1Calls;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "weekendmsone")
public interface MS1Interface {
	
	@GetMapping("/checkmsone")
	public String fetchDataFromMS1();

}
