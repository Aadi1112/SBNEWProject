package com.aadi;

public class DebitCardPayment implements Ipayment {

	public DebitCardPayment() {
		System.out.println("Debit Card :: Constructor");
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void processPayment(double amt) {
		
		System.out.println("Debit card payment processing...");
		
	}

}
