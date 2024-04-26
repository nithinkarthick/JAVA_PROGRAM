package com.string.practice;

public class ReverseNumber {

	
	public static void main(String[] args) {
		
		int n = 1232;
		int rev = 0;
		
		while(n>0) {
			int digit = n %10;
			rev   = rev * 10 +digit ;
			n = n/10;
		}
		
		System.out.println("rev : "+rev);
	}
}
