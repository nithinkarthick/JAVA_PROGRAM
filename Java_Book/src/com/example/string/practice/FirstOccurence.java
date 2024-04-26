package com.string.practice;

public class FirstOccurence {

	
	public static void main(String[] args) {
		
		String s= "hello world";
		char target = 'o';
		
		System.out.println("first : "+firstOccur(s, target));
		
		
	}
	
	public static int firstOccur(String s, char target) {
		for(int i =0 ;i<s.length();i++) {
			if(s.charAt(i) == target)
			{
				return i;
			}
		}
		
		return -1;
	}
}
