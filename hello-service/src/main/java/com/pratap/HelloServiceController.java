package com.pratap;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloServiceController {
	
	@Value("${server.port}")
	private int port;
	
	@RequestMapping
	public String hello() {
		return "Hello! from "+ port;
	}
	
	@GetMapping("/hi")
	public String sayHi()
	{
		return "Hi !! from port "+port;
	}
}
