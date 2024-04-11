package com.example.leetcode;

public class SingleNumber {

	
	 public int singleNumber(int[] nums) {
	        int num = 0;
	        for(int i=0;i<nums.length;i++){
	                num = num^nums[i];
	        }
	        return num;
	    }
	 
	 
	 /*
	  * Input: nums = [2,2,1]
Output: 1
Example 2:

Input: nums = [4,1,2,1,2]
Output: 4
Example 3:

Input: nums = [1]
Output: 1
	  */
}
