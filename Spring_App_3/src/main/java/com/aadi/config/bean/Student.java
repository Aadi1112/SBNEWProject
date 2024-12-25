package com.aadi.config.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
//	@Autowired
	Laptop laptop;//it is used to inject object into referce variable

	
	
//	public Student(Laptop laptop) {
//		
//		this.laptop=laptop;
//	}
	
	@Autowired
	public void setLaptop(Laptop laptop) {
		
		this.laptop=laptop;
	}
	
	
	
	 
	 public void study() {
		 
		 laptop.start();
		 System.out.println("study is started..");
		 
	 }
}
