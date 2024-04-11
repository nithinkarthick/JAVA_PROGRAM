package com.example.java;

public class NumberOf1Bits {

	
	public static void main(String[] args) {
		
		System.out.println(hummingWeight(123));
	}
	
	public static int hummingWeight(int n) {
		int count = 0;
		while(n!=0) {
			count += n & 1;
		//	n = n/2;
			n  >>= 1;
			System.out.println("n: "+n);
		}
		
		return count;
	}
}
