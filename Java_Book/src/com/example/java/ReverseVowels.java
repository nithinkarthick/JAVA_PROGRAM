package com.example.java;

import java.util.HashSet;

public class ReverseVowels {

	
	
	public static void main(String[] args) {
		
		String input = "abcde";
		String output = reverse(input);
		System.out.println(input);
		System.out.println(output);
	}
	
	
	public static String reverse(String input) {

		char[] ch = input.toCharArray();
		int i = 0;
		int j = input.length()-1;
		
		HashSet<Character> vowels = new HashSet<Character>();
		
		vowels.add('a');
		vowels.add('e');
		vowels.add('i');
		vowels.add('o');
		vowels.add('u');
		vowels.add('A');
		vowels.add('E');
		vowels.add('I');
		vowels.add('O');
		vowels.add('U');
		
		while(i<j) {
			while(i<j && !vowels.contains(ch[i])) {
				i++;
			}
			while(i<j && !vowels.contains(ch[j])) {
				j--;
			}
			
			if(i<j) {
				char temp = ch[i];
				ch[i] = ch[j];
				ch[j] = temp;
				i++;
				j--;
			}
		}
		
		return new String(ch);
	}
	
	
	
}
