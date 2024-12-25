package com.aadi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

	//http://localhost:8080/hello/hii
	
	@GetMapping("/hii")
	public String hello(Model model) {
		
		model.addAttribute("msg", "Hello Everyone"); 
		
		return "hello";
	}
	
	
	@PostMapping("/hii")
	public String greet(Model model) {
		
		String msg="Good Morning"; 
		
		return msg;
	}
	
	

	
}
