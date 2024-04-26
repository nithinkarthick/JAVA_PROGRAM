package com.string.practice;

public class SwapTwoNumbers {
	
	public static void main(String[] args) {
		
		int a= 10;
		int b = 20;
		
//		int temp = 0;
//		
//		temp = a ;
//		a = b;
//		b = temp;
		
	//	System.out.println("a: "+a+" b : "+b);
		
		withoutVariable(a, b);
	}
	
	public static void withoutVariable(int a , int b) {
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		
		System.out.println("a : "+a + " b : "+b);
		
	}

}
