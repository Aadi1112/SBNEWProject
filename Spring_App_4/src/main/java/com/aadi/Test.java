package com.aadi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.aadi.service.ReportService;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext cc=new AnnotationConfigApplicationContext(AppConfig.class);
		
		ReportService service= cc.getBean(ReportService.class);
		
		service.generateReport();
	}
}
