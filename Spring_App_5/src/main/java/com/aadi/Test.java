package com.aadi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext cc=new AnnotationConfigApplicationContext(App.class);
		
		UserDao dao= cc.getBean(UserDao.class);
		dao.getData();
		
		ConfigurableApplicationContext ccc=
				(ConfigurableApplicationContext) cc;
		
		ccc.close();
		
		
	}
}
