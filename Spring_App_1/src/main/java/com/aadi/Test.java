package com.aadi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		//IOC Will Start
		ApplicationContext cc=new ClassPathXmlApplicationContext("beans.xml");
	
	   
		PaymentService service= cc.getBean(PaymentService.class);
		
		service.doPayment(30000);
		
	
	
	
	}
}
