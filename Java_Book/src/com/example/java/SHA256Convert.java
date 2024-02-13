package com.java.hackerrank;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class SHA256Convert {

	
	  public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner sc = new Scanner(System.in);
	        String s = sc.next();
	        try{
	            System.out.println(toHex(getSha(s)));
	            }catch(Exception e)
	            {
	                
	            }
	        sc.close();
	        
	    }
	    
	    public static byte[] getSha(String input) throws NoSuchAlgorithmException
	        {
	         MessageDigest md = MessageDigest.getInstance("SHA-256");
	         
	          return md.digest(input.getBytes(StandardCharsets.UTF_8));
	    }
	    
	    public static String toHex(byte[] hash){
	        BigInteger num = new BigInteger(1, hash);
	        
	        StringBuffer hex = new StringBuffer(num.toString(16));
	        
	        while(hex.length() <64){
	            hex.insert(0, "0");
	        }
	        
	        return hex.toString();
	    }
}
