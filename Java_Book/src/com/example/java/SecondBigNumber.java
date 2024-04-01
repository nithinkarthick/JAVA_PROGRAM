package com.example.java;

public class SecondBigNumber {

	
	public static void main(String[] args) {
		
		int[] n = {1,3,4,5,6,8,7};
		
		int bignum = 0;
		int secondBig = 0;
		
		for(int i =0 ;i<n.length ;i++) {
			
			if(n[i]>bignum) {
				secondBig = bignum;
				bignum = n[i];
				
			}
			else if(n[i]>secondBig) {
				secondBig  = n[i];
			}
		}
		
		System.out.println("sec :"+secondBig);
	}
	
	
}
