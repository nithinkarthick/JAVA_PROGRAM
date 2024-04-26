package com.string.practice;

public class PalindromCheck {

	public static void main(String[] args) {
		
		String s = "noon";
		
		System.out.println(check(s));
	}
	
	public static boolean check(String s) {
		int i =0;
		int j = s.length()-1;
		
		while(i<j) {
			if(s.charAt(i++) != s.charAt(j--)) {
				return false;
			}
		}
		
		return true;
	}
}
