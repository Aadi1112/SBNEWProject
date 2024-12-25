package com.aadi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greet")
public class GreetController {

	////http://localhost:8080/greet/hii

	
	@GetMapping("/hii")
	public String hello() {
		
		
		return "Hii I am Aadi";
	}
}
