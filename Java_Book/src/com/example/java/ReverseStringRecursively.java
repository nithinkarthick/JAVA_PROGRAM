package com.example.java;

public class ReverseStringRecursively {

	
	public static void main(String[] args) {
	
		String input = "I Love India";
		
		System.out.println(reverse(input));
	}
	
	
	public static String reverse(String s) {
		
		int spaceIndex = s.indexOf(' ');
		
		if(spaceIndex == -1) {
			return s;
		}
		
		String first = s.substring(0, spaceIndex);
		String remWords = s.substring(spaceIndex + 1);
		
		
		return reverse(remWords)+ " "+first;
		
	}
	
}
