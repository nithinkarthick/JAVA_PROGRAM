package com.string.practice;

public class SumOfDigits {

	public static void main(String[] args) {
		
		int n  = 123;
		int sum = 0;
		while(n>0) {
			int digit = n % 10;
			sum += digit;
			n = n/10;
			
		}
		
		System.out.println(sum);
		
	}
}
