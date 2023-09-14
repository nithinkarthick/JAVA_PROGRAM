package com.java.hackerrank;

public class CaesarCipher {

	
	
	public static String caesarCipher(String s, int k) {
	    // Write your code here
	    StringBuffer result = new StringBuffer();
	    for(char ch : s.toCharArray()){
	        
	        if(Character.isLetter(ch)){
	           char base = Character.isLowerCase(ch) ? 'a' : 'A';
	           char enc = (char) (base + (ch - base + k)%26);
	           result.append(enc);
	           
	            
	        }else{
	            result.append(ch);
	        }
	    }
	    
	    return result.toString();

	    }

	
	
}
