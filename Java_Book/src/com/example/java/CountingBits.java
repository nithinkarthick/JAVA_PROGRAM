package com.example.java;

import java.util.Arrays;

public class CountingBits {

	
	public static void main(String[] args) {
		
		int n = 5;
	
	//	n <<=2;
		System.out.println(n);
		
			System.out.println(Arrays.toString(count(n)));
		
	}
	
	public static int[] count(int n)
	{
		
		int[] ans = new int[n+1];
		
		for(int i=1;i<=n;i++) {
			ans[i] = ans[i >> 1] + (i &1);
		}
		
		return ans;
		
	}
}
