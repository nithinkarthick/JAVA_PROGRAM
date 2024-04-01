package com.example.leetcode;

public class Test {

	
	public static void main(String[] args) {
		
		String s = "textbook";
		
		int l = s.length();
		
		String a = s.substring(0,l/2);
		String b = s.substring(l/2);
		
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		
	}
}
