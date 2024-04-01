package com.example.java;

public class ReplaceIPAddress {

	
	public static void main(String[] args) {
		
		String ip = "128.100.150.2";
		
		// output 128[.]100[.]150[.]2
		
		String result = "";
		
		for(int i =0 ;i<ip.length();i++) {
			
			if(ip.charAt(i)=='.') {
				result += "[.]";
			}else {
				result += ip.charAt(i);
			}
			
		}
		
		System.out.println(result);
		
		System.out.println(ip.replace(".", "[.]"));
		
	}
}
