package com.example.java;

public class SubstringIndex {

	
	public static void main(String[] args) {
		
		String s1 = "abcde123dhf";
		String s2 = "123564";
		
		int index = s1.indexOf(s2);
		
		if(index!=-1) {
			System.out.println(index);
		}else {
			System.out.println("-1");
		}
	}
}
