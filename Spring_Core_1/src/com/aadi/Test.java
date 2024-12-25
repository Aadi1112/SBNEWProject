package com.aadi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		//Student s1=new Student(new Laptop("Lenevo"),new Tab("IPAD"));
		
		Student s1=new Student();
		
//		s1.laptop=new Laptop("lenevo");
//		s1.tab=new Tab("Ipad");
		
		s1.setLaptop(new Laptop("lenevo"));
		s1.setTab(new Tab("Ipad"));
		s1.study();
		
		ApplicationContext cc=new ClassPathXmlApplicationContext("aadi.xml")
	}
}
