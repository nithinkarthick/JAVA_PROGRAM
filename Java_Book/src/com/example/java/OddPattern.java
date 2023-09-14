package com.example.java;

public class OddPattern {

	
	public static void main(String[] args) {
		
		String s = "geeksforgeeks";
		
		int length = s.length();
		
		for(int i=0 ;i<length ;i++) {
			for(int j=0; j<length ;j++) {
				if(j==i || j== length - 1 - i) {
					System.out.print(s.charAt(j));
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		
	}
}

//output
//		g           s
//		e         k 
//		 e       e  
//		  k     e   
//		   s   g    
//		    f r     
//		     o      
//		    f r     
//		   s   g    
//		  k     e   
//		 e       e  
//		e         k 
//		g           s
