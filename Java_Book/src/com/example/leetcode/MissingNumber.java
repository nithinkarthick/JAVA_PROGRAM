package com.example.leetcode;

import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) {
		
	}
	
	 public int missingNumber(int[] nums) {
	     int num = 0;
	     Arrays.sort(nums);

	     for(int i=0 ;i< nums.length;i++){
	         if(nums[i]==i){
	             num += 1;
	         }
	         else {
	             return i;
	         }
	     }

	    return num;

	    }
	 
	 
	 /*
	  * 
	  * public int missingNumber(int[] nums) {
        int n = nums.length;
        int total  =   (n * (n+1))/2;
        int sum  =0;
        for(int i=0;i< n;i++){
            sum += nums[i];
        }
        return total-sum;
    }
    
	  */
}
