package com.example.java;

public class DecimalToBinary {

	
	public static void main(String[] args) {
		
		int n = 45;
		convert(n);
	}
	
	public static void convert(int n) {
		
		try {
		int[] binary = new int[32];
		int id=0;
		while(n>0) {
			binary[id++] =  n%2;
			n  = n/2;
		}
		
		for(int i=id-1 ; i>=0 ; i--) {
			System.out.print(binary[i]+ "");
		}
	
	}catch(Exception e) {
		e.printStackTrace();
	}
	
}
	
}
