package com.example.java;

public class RepeatCharacters {

	
	public static void main(String[] args) {
		
		String input1 = "a2b";
	//	String input1 = "a2b1c3";
		
		
	//	System.out.println(input1.charAt(0)-'0');
		
		System.out.println(repeatChar(input1));
	//	System.out.println(repeatChar(input2));
	}
	
	public static String repeatChar(String input) {
		
		StringBuilder result = new StringBuilder();
		int i=0;
		
		while(i < input.length()) {
			char ch = input.charAt(i);
			i++;
			
			if(i<input.length() && Character.isDigit(input.charAt(i))) {
				System.out.println("if");
				int count = 0;
				
				while(i<input.length() && Character.isDigit(input.charAt(i))) {
					count =  (input.charAt(i) - '0');
					System.out.println(input.charAt(i) );
					i++;
					
					System.out.println(count);
				}
				
				for(int j=0 ;j<count;j++) {
					result.append(ch);
				}
				
			}else {
				System.out.println("else");
				result.append(ch);
			}
			
		}
		
		return result.toString();
	}
	
}
