package com.example.java;

public class ClimbStairs {

	
	public static void main(String[] args) {
		
		int n = 5;
		System.out.println(climbs(n));
		
	}
	
	public static int climbs(int n) {
		if(n==0 || n==1) {
			return 1;
		}
		
		System.out.println(n);
		
		return climbs(n-1) + climbs(n-2);
	}
	
	
	public static int climbs2(int n) {
		if(n==0 || n==1) {
			return 1;
		}
		
		int curr = 1, prev =1;
		for(int i=2; i<=n ;i++) {
			int temp = curr;
			curr = prev + curr;
			prev = temp;
			
		}
		
		return curr;
	}

	
	
}
