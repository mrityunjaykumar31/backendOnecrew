package com.assesemnetApp.assesemnetApp.conroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Login {
	
	@GetMapping("/login")
	public String home() {
		
		System.out.println("working");
		return "xx";
	}

}
