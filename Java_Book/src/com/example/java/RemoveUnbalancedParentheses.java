package com.example.java;

import java.util.Stack;

public class RemoveUnbalancedParentheses {

	
	public static void main(String[] args) {
		
		String input = "((abc)((de))";
	
		
		System.out.println();
	}
	
	
	public static String revomeUnbalance(String input) {
		
		Stack<Integer> stack = new Stack<>();
		
		StringBuilder result = new StringBuilder();
		
		for(char c : input.toCharArray()) {
			
			if(c=='(') {
				stack.push(result.length());
				result.append(c);
			}else if(c==')') {
				
				if(!stack.isEmpty()) {
					int index = stack.pop();
					result.append(c);
					result.setCharAt(index, ' ');
				}
				
			}else {
				result.append(c);
			}
		}
		
		for(int i=result.length()-1 ; i>=0; i++) {
			if(result.charAt(i)==' ') {
				result.deleteCharAt(i);
			}else {
				break;
			}
		}
		
		return result.toString();
	}
	
}
