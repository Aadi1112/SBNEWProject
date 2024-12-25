package com.aadi;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class UserDao  {

	
	@PostConstruct
	public void init()
	{
		System.out.println("getting Db Connection");
	}
	
	
	public void getData()
	{
		
		System.out.println("Getting data from Db..");
	}
	

	@PreDestroy
	public void destroy()
	{
		System.out.println("Closing DB Connection...");
	}

	
}
