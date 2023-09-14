package com.example.java;

import java.util.Stack;

public class ValidMathExpression {

	
	public static void main(String[] args) {
	
		String input = "(())";
	
		if(isVaild(input)) {
			System.out.println("valid");
		}else {
			System.out.println("not valid");
		}
		
	}
	
	public static boolean isVaild(String input) {
		Stack<Character> st = new Stack<>();
		
		for(char ch : input.toCharArray()) {
			
			if(ch=='(') {
				st.push(ch);
			}
			else if(ch==')' )
			{
				if(st.isEmpty() || st.pop()!='(') {
					return false;
				}
			}
			
			
		}
		return st.isEmpty();
		
		
	}
	
	
}
