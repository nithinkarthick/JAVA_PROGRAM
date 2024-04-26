package com.string.practice;

public class ReverseEachWord {

	public static void main(String[] args) {
		
	
	String s  = "hello world!" ;
	
	String[] spt = s.split("\\s");
	
	String result = "";
	for(String str : spt) {
		result = result + reverse(str)+" ";
	}
	
	
	System.out.println(result);
	}
	
	public static String reverse(String s ) {
		String rev = "";
		for(int i=s.length()-1 ;i>=0 ;i--) {
			rev = rev + s.charAt(i);
		}
		
		return rev;
	}
	
}

