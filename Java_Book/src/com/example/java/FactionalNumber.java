package com.example.java;

public class FactionalNumber {

	
	public static void main(String[] args) {
		
		int num = 5;
		int result = 1;
		while(num != 0) {
			result = result*num;
			num--;
		}
		
		System.out.println(result);
		
	}
}
