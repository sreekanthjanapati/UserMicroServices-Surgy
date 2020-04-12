package com.microservices.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/hello")
public class HelloController {
	
	@Autowired
	private Environment env;
	
	@GetMapping
	public String getHello() {
		
		return "User micro service running succefully :: "+env.getProperty("server.port");
	}

}
