package com.lambda;

public class Abc {

	public static void main(String[] args) {

//		Demo d = (a,b) -> {
//
//			System.out.println("add nethod :"+ (a+b));
//		};
//
//		d.fun(10,20);

//		Demo d=(a,b)->a+b;
//	
//		
//		System.out.println(d.add(10,20));

//		Demo d = (name) -> {
//			if (name.startsWith("A")) {
//				return "starting with A";
//			} else
//
//			{
//				return "Not Starting with A";
//			}
//
//		};
//		System.out.println(d.checkName("AAdi"));
		Demo d = (str1, str2) -> {

			if (str1.compareTo(str2) == 0) {
				return "Same Strings";
			} else {
				return "Different Strings";
			}

		};

		System.out.println(d.compareTwoStrings("Ram", "Ram"));
	}
}
