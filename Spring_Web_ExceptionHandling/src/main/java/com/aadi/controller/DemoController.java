package com.aadi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

	@GetMapping("/greet")
	public String greetMsg(Model model) {
		int i=10/0;
//		String s=null;
//		s.length();
		model.addAttribute("msg", "Good Morning..");
		return "index";
	}
	
	@GetMapping("/wish")
	public String wishMsg(Model model) {
		
		model.addAttribute("msg", "Happy Birthday");
		return "index";
	}
	
//	@ExceptionHandler(value = Exception.class)
//	public String handleAe(Exception e) {
//		
//		return "errorPage";
//		
//	}
	
//	@ExceptionHandler(value = NullPointerException.class)
//	public String handleAe(NullPointerException e) {
//		
//		return "errorPage";
//		
//	}
}
