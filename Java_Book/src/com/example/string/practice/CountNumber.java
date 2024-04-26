package com.string.practice;

public class CountNumber {

	
	public static void main(String[] args) {
		
		
		int n = 1234567890;
		int count = 0;
		while(n>0) {
			count += 1;
			n = n/10;
		}
		
		System.out.println("count : "+count);
	}
}
