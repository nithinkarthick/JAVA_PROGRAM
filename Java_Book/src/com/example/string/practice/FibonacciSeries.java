package com.string.practice;

public class FibonacciSeries {

	
public static void main(String[] args) {
		
		int n = 12;
		
		for(int i=0 ;i<n;i++) {
			System.out.print(fibRecursion(i)+ " ");
		}
			
		
	}
	
	public static int fibRecursion(int n ) {
		if(n<=1) {
			return n;
					}
		
		return fibRecursion(n-1) + fibRecursion(n-2);
		
	}
	
	public static void fib1(int n ) {
		
		int num1 = 0, num2 = 1;
		
		for(int i=0 ;i<n ;i++) {
			System.out.print(num1+" ");
			
			int num3 = num1+num2;
			num1=num2;
			num2=num3;
			
		}
	}
}
