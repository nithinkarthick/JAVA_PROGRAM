package com.example.java;

public class MaximumSubarraySum {

	
	public static void main(String[] args) {
		
		int[] num = {1,2,3,-3,-2,1,5};
		
		System.out.println(maxNum(num));
		
		
	}
	
	public static int maxNum(int[] nums) {
		
		if(nums == null || nums.length ==0) {
			return 0;
		}
		
		int maxSum = nums[0];
		int current = nums[0];
		
		for(int i=1; i<nums.length ;i++) {
			current = Math.max(nums[i], nums[i]+current);
			maxSum = Math.max(maxSum, current);
		}
		
		return maxSum;
	}
}
