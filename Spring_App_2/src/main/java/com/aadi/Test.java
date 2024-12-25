package com.aadi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext cc=new ClassPathXmlApplicationContext("aadi.xml");
	
	  Car c= cc.getBean(Car.class);
	  System.out.println(c.hashCode());
	  
	  
	  Car c1= cc.getBean(Car.class);
	  System.out.println(c1.hashCode());
	  
	  Car c2= cc.getBean(Car.class);
	  System.out.println(c2.hashCode());
	
	}
}
