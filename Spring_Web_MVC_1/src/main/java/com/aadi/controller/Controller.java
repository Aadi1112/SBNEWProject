package com.aadi.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller // it is responsible to return repsonse as a view
public class Controller {

	
//	@GetMapping("/hello")
//	public ModelAndView greetMessage() {
//		ModelAndView mav = new ModelAndView();
//		mav.addObject("msg", "Good Morning ...");
//
//		mav.setViewName("message");
//
//		return mav;
//	}
//	
//	@GetMapping("/welcome")
//	public ModelAndView welcome() {
//		ModelAndView mav = new ModelAndView();
//		mav.addObject("msg", "Welcome to learn SPring Web MVC ...");
//
//		mav.setViewName("message"); //view page
//
//		return mav;
//	}
	
	@GetMapping("/welcome")
	public String greet(Model model) {
		
		model.addAttribute("msg", "Good Morning..");
		return "message";
	}
	

	@GetMapping("/hello")
	public String welcome(Model model) {
		
		model.addAttribute("msg", "Welcome Everyone..");
		return "message";
	}
}
