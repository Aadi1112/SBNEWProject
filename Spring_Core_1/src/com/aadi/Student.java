package com.aadi;

public class Student{
	
	Laptop laptop;//null
	
	Tab tab;//null
	
	
//	public Student(Laptop laptop,Tab tab) {
//		this.laptop=laptop;
//		this.tab=tab;
//		// TODO Auto-generated constructor stub
//	}
	
	
	void setLaptop(Laptop ll) {
		laptop=ll;
	}
	
	void setTab(Tab t) {
		
		tab=t;
	}
	
	void study() {
		laptop.start();
		tab.start();
		System.out.println("Student doing study..");
	}

}
