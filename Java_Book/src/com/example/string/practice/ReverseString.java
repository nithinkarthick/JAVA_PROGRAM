package com.string.practice;

public class ReverseString {

	
	
	public static void main(String[] args) {
		
		String  s = "nithin karthick";
		
		String result = "";
		
		for(int i = s.length()-1 ; i>=0 ;i--) {
			result = result + s.charAt(i);
		}
		
		System.out.println("rev : "+result);
	}
	
	
}
