package com.string.practice;

public class CountChar {

	
	public static void main(String[] args) {
		
		String s = "a b c d e";
		
		char[] ch = s.toCharArray();
		int count = 0;
		for(int i=0 ;i<s.length();i++) {
			if(ch[i]!=' ') {
				count += 1;
			}
		}
		
		System.out.println(count);
	}
}
