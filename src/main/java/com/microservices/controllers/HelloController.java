package com.microservices.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/hello")
public class HelloController {
	
	@GetMapping
	public String getHello() {
		
		return "User micro service running succefully";
	}

}
