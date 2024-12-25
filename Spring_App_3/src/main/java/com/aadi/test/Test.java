package com.aadi.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.aadi.config.AppConfig;
import com.aadi.config.bean.Student;

public class Test {

	public static void main(String[] args) {
		
		
		//ApplicationContext cc=new ClassPathXmlApplicationContext("")
		
		ApplicationContext cc=new AnnotationConfigApplicationContext(AppConfig.class);
	
	  Student s=  cc.getBean(Student.class);
	  s.study();
	}
}
