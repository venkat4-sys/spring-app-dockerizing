package com.getinfy.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicRestApi {
	
	@GetMapping("/msg")
	public String welcomeMsg() {
		return "Welcome To Docker !!!";
	}
	

}
