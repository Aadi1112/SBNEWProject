package com.aadi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args)  {
		
		//IOC will start
		ApplicationContext context= new AnnotationConfigApplicationContext(Car.class);
		
		
	
		
	}

}
