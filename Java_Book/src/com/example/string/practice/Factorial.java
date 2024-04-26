package com.string.practice;

public class Factorial {

	
	public static void main(String[] args) {
		
		int n = 5;
		int fact = 1;
		
		for(int i = 1; i<=n;i++)
		{
			fact = fact * i;
		}
		
		System.out.println("fact: "+fact);
	}
	
	public static int fact(int n ) {
		if(n==0)
			return 1;
		
		
		return (n * fact(n-1));
	}
}
