package com.codeit;

public class Demo {

//	static boolean checkSortedOrNot() {
//		//1>2  i=1
//
//		String s[]= {"aadash","aadi","aavi","ravi"};
//		
//		for (int i = 0; i < s.length-1; i++) {
//
//			if(s[i].compareTo(s[i+1])>0)
//			{
//				return false;
//			}
//		}
		
//		return true;
//
//	}
	
	static int result() {
		

		int arr[]= {12,23,45,45,56,67,67,45};
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = i+1; j < arr.length; j++) {
				
				if(arr[i]==arr[j])
				{
					return arr[i];
				}
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {
		
		if(result()!=-1)
		{
			System.out.println("first duplciate is  :"+result());
		}
		
		
		
		
//		if(checkSortedOrNot()) {
//			
//			System.out.println("its sorted");
//		}
//		else {
//			System.out.println("not sorted");
//		}

		// Check the given Array is Sorted Or NOT ? ...

	}
}
