package com.aadi.config.bean;

import org.springframework.stereotype.Component;

@Component
public class Laptop {
	
	public Laptop() {
		System.out.println("Laptop :: Constructor");
		// TODO Auto-generated constructor stub
	}

	public void start() {
		
		System.out.println("Laptop is started..");
	}
}
