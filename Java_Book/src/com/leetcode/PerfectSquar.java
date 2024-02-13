package com.example.leetcode;

import java.util.Arrays;

public class PerfectSquar {

	
	public static void main(String[] args) {
		
	
		int n = 12;
		
		int[] num = new int[n+1];
		Arrays.fill(num, Integer.MAX_VALUE);
		num[0]=0;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j*j<=i;j++) {
				num[i] = Math.min(num[i], 1+num[i-(j*j)]);
			}
		}
		
		System.out.println("num:" +num[n]);
	}
}
