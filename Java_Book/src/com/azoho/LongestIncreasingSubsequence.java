package com.azoho;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestIncreasingSubsequence {
    public static List<Integer> findLIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new ArrayList<>();
        }

        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1); // Initialize dp array with 1

        // Calculate longest increasing subsequence
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        // Find the maximum value in dp array
        int maxLength = 0;
        for (int length : dp) {
            maxLength = Math.max(maxLength, length);
        }

        // Construct the longest increasing subsequence
        List<Integer> lis = new ArrayList<>();
        int lastIndex = -1;
        for (int i = n - 1; i >= 0; i--) {
            if (dp[i] == maxLength && (lastIndex == -1 || nums[i] < lis.get(lastIndex))) {
                lis.add(nums[i]);
                maxLength--;
                lastIndex++;
            }
        }

        // Reverse the lis list
        List<Integer> result = new ArrayList<>();
        for (int i = lis.size() - 1; i >= 0; i--) {
            result.add(lis.get(i));
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 5, 3, 7};
        System.out.println("Input: " + Arrays.toString(arr1));
        System.out.println("Output: " + findLIS(arr1));

        int[] arr2 = {10, 22, 9, 33, 21, 50, 41};
        System.out.println("Input: " + Arrays.toString(arr2));
        System.out.println("Output: " + findLIS(arr2));
    }
    
    
    
//    Find the longest increasing sub-sequence in Array.
//    Input : {1,5,3,7}
//    Output: {1,5,7} or {1,3,7}
//
//    Input : {10,22,9,33,21,50,41}
//    Output: {10,22,33,50}
}
