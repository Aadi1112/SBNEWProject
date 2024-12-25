package com.aadi;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.aadi.entity.Product;

@SpringBootApplication
public class SpringDataJpaMdsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaMdsApplication.class, args);
	}

	
	@Autowired
	ProductRepo productRepo;
	@Override
	public void run(String... args) throws Exception {
		
		 
		
		 
		
		Product product=new Product(2, "Watch", 10000.00);
		
		productRepo.save(product);
		
	}

}
