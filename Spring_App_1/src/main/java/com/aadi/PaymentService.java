package com.aadi;

public class PaymentService {

	public PaymentService() {
		System.out.println("PaymentService:: Constructor");
		// TODO Auto-generated constructor stub
	}

	Ipayment payment;// null

	PaymentService(Ipayment payment) {

		this.payment = payment;

	}
	
	public void setPayment(Ipayment payment)
	{
		System.out.println("Setter method called...");
		this.payment=payment;
	}

	public void doPayment(double amt) {
		payment.processPayment(amt);

		System.out.println("Payment Success..Printing Receipt..");

	}
}
