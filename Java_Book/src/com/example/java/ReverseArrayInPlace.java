package com.example.java;

import java.util.Arrays;

public class ReverseArrayInPlace {

	
	public static void main(String[] args) {
		
		String[] v1 = {"nk", "nithin", "karthick", "kk" };
		
		reverse(v1);
		System.out.println(Arrays.toString(v1));
		
	}
	
	
	public static void reverse(String[] name) {
		
		if(name==null || name.length<2) {
			return ;
		}
		
		for(int i=0; i<name.length/2 ; i++) {
			System.out.println(i);
			String temp  = name[i];
			name[i] = name[name.length-1 -i];
			System.out.println( "" +name[name.length-1 -i] );
			
			name[name.length-1 -i] = temp;
		}
	}
}
