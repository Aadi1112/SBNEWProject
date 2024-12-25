package com.aadi;

public class CreditCardPayment implements Ipayment {
	
	
	public CreditCardPayment() {
		final int a=34;
		System.out.println("CreditCard ::Constructor");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void processPayment(double amt) {
		
		//Logic 
		
		System.out.println("Credit card payment processing...");
		
	}

}
