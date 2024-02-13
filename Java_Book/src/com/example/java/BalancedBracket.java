package com.java.hackerrank;

import java.util.Stack;

public class BalancedBracket {

	
	 public static String isBalanced(String s) {
		    // Write your code here
		    Stack<Character> stack = new Stack<>();
		    
		    for(char ch : s.toCharArray()){
		        
		        if(ch=='(' || ch=='{' || ch=='['){
		            stack.push(ch);
		        }else{
		           
		           if(stack.isEmpty()){
		               return "NO";
		           } 
		           
		           char top = stack.pop();
		           if(ch==')' && top!='('){
		                return "NO";
		           }
		            if(ch=='}' && top!='{'){
		                return "NO";
		           }
		           if(ch==']' && top!='['){
		                return "NO";
		           }
		        }
		        
		    }
		    
		    return stack.isEmpty() ? "YES" : "NO";

		    }
	 
	 
}
