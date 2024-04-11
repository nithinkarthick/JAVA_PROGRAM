package com.example.java;

import java.util.Arrays;

public class MissingNumber {

	
	public static void main(String[] args) {
		int[] num = {0,1,2,3,4,6,7};
		System.out.println(missingnum(num));
	}
	
	public static int missingnum(int[] nums) {
		
		Arrays.sort(nums);
		int n = nums.length;
		
		if(nums[0]!=0) return 0;;
		
		if(nums[n-1]!= n ) return n;
		
		for(int i=0 ;i<n ;i++) {
			if(nums[i]!=i) return i;
		}
		
		return 0;
	}
}
