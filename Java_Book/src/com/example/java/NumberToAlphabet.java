package com.example.java;

public class NumberToAlphabet {


	public static void main(String[] args) {
		
	System.out.println(numToAlph(1));
	System.out.println(numToAlph(150));
	//	System.out.println(numToAlph(735));
		
	}
	
	public static String numToAlph(int number) {
		
		StringBuilder result = new StringBuilder();
		
		
		while(number>0) {
			
			int rem = (number - 1)% 26; // remainder
			char current = (char)('A' + rem);
			result.insert(0, current);
			number = (number-1)/26;
		}
		
		
		
		return result.toString();
		
		
	}


}
