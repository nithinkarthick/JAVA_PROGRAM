package com.string.practice;

import java.util.LinkedHashSet;

public class RemoveDuplicateInString {

	
	public static void main(String[] args) {
		
		String s = "abcdee fg gh tty gdgfsf";
		
		
		LinkedHashSet<Character> hash = new LinkedHashSet<Character>();
		
		char[] ch = s.toCharArray();
		
		for(char c : ch) {
			hash.add(c);
		}
		
		
		for(Character c : hash) {
			System.out.print(c);
		}
		
		
		
		
		
		
		
		
		
		
	}
}
