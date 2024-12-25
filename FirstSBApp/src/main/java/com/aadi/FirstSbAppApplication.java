package com.aadi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class FirstSbAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext cc=
				SpringApplication.run(FirstSbAppApplication.class, args);
		
		System.out.println(cc.getClass().getName());
	}

}
