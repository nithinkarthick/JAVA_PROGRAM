package com.example.java;

public class PrimeNumberCheck {

	
	public static void main(String[] args) {
		
		int n =6;
		
		if(isPrime(n)) {
			System.out.println("prime");
		}else{
			System.out.println("not prime");
		}
	}
	
	public static boolean isPrime(int n) {
		if(n<=1) {
			return false;
		}
		if(n==2) {
			return true;
		}
		
		for(int i=2 ;i<=Math.sqrt(n); i++) {
			if(n%i==0) {
				return false;
			}
		}
		
		return true;
	}
	
}
