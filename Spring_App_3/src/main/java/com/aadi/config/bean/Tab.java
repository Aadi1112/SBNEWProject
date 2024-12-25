package com.aadi.config.bean;

import org.springframework.stereotype.Component;

@Component
public class Tab {

	public Tab() {
		System.out.println("Tab :: COnstructor");
		// TODO Auto-generated constructor stub
	}
	
	public void start() {
		
		System.out.println("Tab is started...");
	}
}
