package com.string.practice;

public class Amstrongnumber {

	
	public static void main(String[] args) {
		
		int n = 371;
		int orgNo , rem , result = 0;
		orgNo = n;
		
		
		while(orgNo != 0) {
			rem = orgNo % 10;
			result += Math.pow(rem, 3);
			orgNo /= 10 ;
			
		}
		
		if(result == n) {
			System.out.println("amstrong");
		}else {
			System.out.println("not amstrong");
		}
		
	}
}
