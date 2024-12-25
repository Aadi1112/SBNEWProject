package com.aadi;

public class Car  {
	
	IEngine eng; //field injection
	
	public void drive() {
		
		eng.start();
		System.out.println("Happy Journey....");
	}

}
