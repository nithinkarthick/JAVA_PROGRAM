package com.azoho;

public class EncyptionPassword {

	
	
	public static void main(String[] args) {
		
		String input = "abcDEF123@";
		
		System.out.println(encrypt(input));
	}
	
	public static String encrypt(String password) {
		char[] enc = new char[password.length()];
		
		for(int i=0 ;i<password.length();i++) {
			char ch = password.charAt(i);
			
			if(Character.isLowerCase(ch)) {
				if(ch=='z') {
					enc[i] = 'a';
				}else {
					enc[i] = (char)(ch + 1);
				}
			}
			else if(Character.isUpperCase(ch)) {
				if(ch=='Z') {
					enc[i] = 'A';
				}else {
					enc[i] = (char)(ch + 1);
				}
			}
			else if(Character.isDigit(ch)) {
				if(ch=='9') {
					enc[i] = '0';
				}else {
					enc[i] = (char)(ch + 1);
				}
			}else {
				enc[i] = ch;
			}
			
			
		}
		
		return new String(enc);
	}
}
