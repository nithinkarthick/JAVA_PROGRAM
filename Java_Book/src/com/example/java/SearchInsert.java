package com.example.java;

public class SearchInsert {

	
	 public int searchInsert(int[] nums, int target) {

	        for(int i=0;i<nums.length;i++){
	            
	             if(nums[i]>target || nums[i]==target ){
	                return i;
	            }
	             if(i==nums.length-1){
	                return nums.length;
	            }
	       }
	        return 0;
	    }
	 
	 
	 /*
	  * Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1
Example 3:

Input: nums = [1,3,5,6], target = 7
Output: 4
	  */
}
