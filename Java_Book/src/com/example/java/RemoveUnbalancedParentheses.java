package com.example.java;


public class RemoveUnbalancedParentheses {

	
	public static void main(String[] args) {
		
		String input = "(a))((b)(c))(d))((f)";
	
		
		System.out.println(removeUnbalancedParentheses(input));
	}
	
	
	 public static String removeUnbalancedParentheses(String s) {
	        StringBuilder sb = new StringBuilder();
	        int[] count = new int[s.length()];

	        // Step 1: Count the number of unbalanced opening parentheses
	        int openCount = 0;
	        for (int i = 0; i < s.length(); i++) {
	            if (s.charAt(i) == '(') {
	                openCount++;
	            } else if (s.charAt(i) == ')') {
	                if (openCount > 0) {
	                    openCount--;
	                } else {
	                    count[i] = 1; // Mark the closing parenthesis as unbalanced
	                    System.out.println("c1");
	                }
	            }
	        }

	        //  "(((a)";
	        
	        
	        // Step 2: Count the number of unbalanced closing parentheses
	        int closeCount = 0;
	        for (int i = s.length() - 1; i >= 0; i--) {
	            if (s.charAt(i) == ')') {
	                closeCount++;
	            } else if (s.charAt(i) == '(') {
	                if (closeCount > 0) {
	                    closeCount--;
	                } else {
	                    count[i] = 1; // Mark the opening parenthesis as unbalanced
	                    System.out.println("c2");
	                }
	            }
	        }

//	        for (int i = 0; i < s.length(); i++) {
//	        	System.out.println(count[i]+" ");
//	        }

	        
	        // Step 3: Build the resulting string
	        for (int i = 0; i < s.length(); i++) {
	            if (count[i] == 0) {
	                sb.append(s.charAt(i));
	            }
	        }

	        return sb.toString();
	    }
	 
	
}
