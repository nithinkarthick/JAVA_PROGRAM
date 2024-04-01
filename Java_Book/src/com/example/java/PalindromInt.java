package com.example.java;

public class PalindromInt {

	
	public static void main(String[] args) {
		
		int x = 12;
		
		int y = x;
		int temp = 0;
		int rem =0;
		
		while(x>0) {
			rem = x%10;
			temp = (temp*10)+rem;
			x = x/10;
		}
		if(y==temp) {
			System.out.println("palindrom");
		}else {
			System.out.println("not palindrom");
		}
		
		System.out.println("temp: "+temp);
		
	}
}
