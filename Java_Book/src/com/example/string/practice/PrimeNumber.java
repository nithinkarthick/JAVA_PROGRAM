package com.string.practice;

public class PrimeNumber {

	
	
	public static void main(String[] args) {
		
		int n = 5;
		
		System.out.println("sqr: "+Math.sqrt(n));
		if(checkPrime(n)) {
			System.out.println("prime number");
		}else {
			System.out.println("not prime");
		}
	}
	
	
	public static boolean checkPrime(int n)
	{
		if(n<=1) {
			return false;
		}
		if(n==2) {
			return true;
		}
		
		for(int i = 2 ;i <=Math.sqrt(n);i++) {
			if(n%i==0) {
				return false;
			}
		}
		
		return true;
	}
}
