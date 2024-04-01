package com.example.leetcode;

public class FindIndex {

	
	 public int strStr(String haystack, String needle) {
	        int x = needle.length();

	            for(int i=0 ;i<=haystack.length()-x;i++){
	                if(haystack.substring(i,i+x).startsWith(needle)){
	                    return i;
	                }
	            }

	        return -1;
	    }
	 
	 String n = "";
	 String[] stp = n.split(" ");
	 int n1 = stp.length;
	 
	 /*
	  * Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.
Example 2:

Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.
 
	  */
}
