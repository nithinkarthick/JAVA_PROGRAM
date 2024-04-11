package com.example.leetcode;

public class ReverseStringIII {

	
	public static void main(String[] args) {
		// runtime memory
		Runtime runtime = Runtime.getRuntime();
		
		// execution time
		long start = System.currentTimeMillis();
		  // your code here
		
		System.out.println(reverseWords("Let's begin the challenge"));
	
		long end = System.currentTimeMillis();
		System.out.println("Execution time: " + (end - start) + " ms");
		
	
		  // your code here
		  long usedMemory = runtime.totalMemory() - runtime.freeMemory();
		  System.out.println("Memory usage: " + usedMemory + " bytes");
	
	}
	
	  public static String reverseWords(String s) {
	        StringBuffer sb = new StringBuffer();

	        String[] spt = s.split(" ");
	        for(String str : spt){
	              StringBuffer s2 = new StringBuffer();
	                s2.append(str);
	                s2.reverse();
	            sb.append(s2+" ");
	        }

	        return sb.toString().trim();
	    }
	  
}
