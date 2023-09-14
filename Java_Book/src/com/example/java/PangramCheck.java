package com.example.java;

public class PangramCheck {

	
	
	public static void main(String[] args) {
		
		 String input1 = "abc defGhi JklmnOP QRStuv wxyz";
	        String input2 = "abc defGhi JklmnOP QRStuv";

	        boolean result1 = checkAlph(input1);
	        boolean result2 = checkAlph(input2);

	        System.out.println("Output 1: " + result1);
	        System.out.println("Output 2: " + result2);
	}
	
	
	
	public static boolean checkAlph(String input) {
		
		boolean[] alph = new boolean[26];
		
		input = input.toLowerCase();
		
		for(int i=0 ; i<input.length() ; i++) {
			char ch = input.charAt(i);
			
			if(ch>='a' && ch<='z') {
				alph[ch - 'a'] =  true;
			}
			
		}
		
		for(boolean present : alph) {
			if(!present) {
				return false;
			}
		}
		
		return true;
		
	}
}
