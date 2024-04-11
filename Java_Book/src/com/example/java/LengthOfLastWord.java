package com.example.java;

public class LengthOfLastWord {

	
	public static void main(String[] args) {
		
		
		String s = "hello wolrd  a ";
		
		int len = 0;
		
		for(int i=s.length()-1 ; i>=0 ;i--) {
			if(s.charAt(i)!=' ') {
				len++;
			}else if(len != 0) {
				System.out.println("len--> "+len);
				break;
			}
		}
		
		System.out.println(len);
	}
}
