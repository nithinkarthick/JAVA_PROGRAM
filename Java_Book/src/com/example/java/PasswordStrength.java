package com.example.java;

public class PasswordStrength {

	
	
	public static void main(String[] args) {
		
		 String input1 = "Qw!1";
	        String input2 = "Qwertyuiop";
	        String input3 = "QwertY123";
	        String input4 = "Qwerty@123";

	        String result1 = strengthCheck(input1);
	        String result2 = strengthCheck(input2);
	        String result3 = strengthCheck(input3);
	        String result4 = strengthCheck(input4);

	        System.out.println("Output 1: " + result1); // Output: Weak
	        System.out.println("Output 2: " + result2); // Output: Medium
	        System.out.println("Output 3: " + result3); // Output: Good
	        System.out.println("Output 4: " + result4); // Output: Strong
	}
	
	
	public static String strengthCheck(String input) {
		
		boolean rule1 = input.length()>=6;
		boolean rule2 = input.matches(".*[a-z].*");
		boolean rule3 = input.matches(".*[A-Z].*");
		boolean rule4 = input.matches(".*\\d.*") && input.matches(".*[@#$%].*");
		
		int result = (rule1 ? 1 : 0) + (rule2 ? 1 : 0) + (rule3 ? 1 : 0) + (rule4 ? 1 : 0); 
		
		System.out.println(result);
		
		if(result==4) {
			return "Strong";
		}else if(result>=3) {
			return "Good";
		}else if(result>=2) {
			return "Medium";
		}else {
			return "Week";
		}
		
	}
	
}
