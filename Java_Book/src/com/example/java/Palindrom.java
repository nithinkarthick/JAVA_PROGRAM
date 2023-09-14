package com.example.java;

public class Palindrom {

	
	public static void main(String[] args) {
		
		String orgStr = "abcba";
		
		String rev = "";
		
		for(int i=orgStr.length()-1 ; i>=0 ; --i) {
			rev = rev + orgStr.charAt(i);
			
		}
		
		if(rev.equals(orgStr)) {
			System.out.println("palindrom");
		}
		else {
			System.out.println("not palindrom");
		}
	}
}
