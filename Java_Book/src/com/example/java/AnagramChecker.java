package com.example.java;

import java.util.Arrays;

public class AnagramChecker {

	public static void main(String[] args) {
		
		String str1 = "army";
		String str2 = "Mary";
		
		if (areAnagrams(str1.toLowerCase(), str2.toLowerCase())) {
			System.out.println("The strings '" + str1 + "' and '" + str2 + "' are anagrams.");
		} else {
			System.out.println("The strings '" + str1 + "' and '" + str2 + "' are not anagrams.");
		}
	
	
	}
    
	public static boolean areAnagrams(String str1, String str2) {
		
		if(str1.length() != str2.length()) {
			return false;
		}
		
	char[] array1 = str1.toCharArray();
	char[] array2 = str2.toCharArray();
	
	Arrays.sort(array1);
	Arrays.sort(array2);
	
	 return Arrays.equals(array1, array2) ;
	 
			
		
	}
}
