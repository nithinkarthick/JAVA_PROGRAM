package com.example.leetcode;

import java.util.Arrays;

public class LargestPerimeter {

	
	public static void main(String[] args) {
		
//		String input = "nithin karhtick";
//		
//		System.out.println(input.substring(0,6));
		
		int[] n = {1,2,3,4,5,5,6,6,77,78,8,6};
		System.out.println(longestperi(n));
	}
	
	public static long longestperi(int[] nums) {
		long ans = -1;
		long sum =0;
		for(int i=0;i<nums.length;i++) {
			sum += nums[i];
		}
		Arrays.sort(nums);
		
		System.out.println("i : " + (nums.length));
		System.out.println("i : " + (nums.length - 1));
		
		for(int i=nums.length-1; i>=2 ;i--) {
			System.out.println("num : "+nums[i]);
			sum = sum - nums[i];
			System.out.println("sum: "+sum);
			if(sum > nums[i]) {
				return sum + nums[i];
			}
		}
		
		return ans;
	}
}
