package com.aadi;

public class Car {

	public Car() {
		System.out.println("Car constructor ");
		// TODO Auto-generated constructor stub
	}

	IEngine eng;

	public Car(IEngine eng)
	{
		this.eng=eng;
	}
	
//	public void setEng(IEngine eng) {
//
//		this.eng = eng;
//	}

	void drive() {
		eng.start();

		System.out.println("Car started happy journey....");

	}
}
