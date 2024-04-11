package com.example.leetcode;

public class FirstPalindrom {

	
	public static void main(String[] args) {
		
	}
	
	
	public String firstPalindrome(String[] words) {
		   

	       for(int i=0; i<words.length;i++){
	           String org = words[i];
	           StringBuffer sb = new StringBuffer(words[i]);
	           sb.reverse();
	           if(org.equals(sb.toString())){
	               return org;
	           }
	       }
	       return "";
	    }
	
}
