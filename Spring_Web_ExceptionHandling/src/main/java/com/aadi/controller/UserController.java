package com.aadi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.aadi.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService service;
	

//	@GetMapping("/hello")
//	public String wishMsg(Model model) {
//		int i=10/0;
//		model.addAttribute("msg", "Hello Everyone");
//		return "index";
//	}
	
	@GetMapping("/user")
	public String getUser(Model model) {
		String user=service.getUserById(101);
		model.addAttribute("msg", user);
		return "index";
	}
}
