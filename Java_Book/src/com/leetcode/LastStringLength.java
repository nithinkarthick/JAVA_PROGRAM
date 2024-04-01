package com.example.leetcode;

public class LastStringLength {

	
	public static void main(String[] args) {
		
		System.out.println(lengthOfLastWord("hello world"));
	}
	
	 public static int lengthOfLastWord(String s) {
	        
	        String[] split = s.split(" ");
	        int n = split.length;
	        System.out.println("length: "+n);
	        System.out.println("split "+split[n-1]);
	        int count=0;
	        for(int i=0 ; i<split[n-1].length();i++){
	            count += 1;
	        }

	        return count;
	    }
	 
}
