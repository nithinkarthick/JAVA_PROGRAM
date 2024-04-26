package com.string.practice;

public class CheckVowels {

	
	public static void main(String[] args) {
		
		String s  ="bdsj";
		s.toLowerCase();
		
		if(checkVowels(s)) {
			System.out.println("vowel is there!");
		}else {
			System.out.println("no vowels");
		}
		
	}
	
	
	public static boolean checkVowels(String s) {
		char[] ch = s.toCharArray();
		
		for(int i =0 ;i<s.length();i++) {
			
			if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u' ) {
				return true;
			}
		}
		
		return false;
		
	}
}
