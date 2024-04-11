package com.example.java;

import java.math.BigInteger;
import java.util.Arrays;

public class PlusOne {

	
	public static void main(String[] args) {
		
		
		int[] digits = {7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6};
		
		 StringBuilder d1 = new StringBuilder();
	        for (int digit : digits) {
	            d1.append(digit);
	        }

	        BigInteger num = new BigInteger(d1.toString());
	        num = num.add(BigInteger.ONE);

	        String d2 = num.toString();
			int[] dig = new int[d2.length()];
			for(int  i = 0 ;i<d2.length();i++ ) {
				dig[i] = d2.charAt(i) - '0';
			}

		
		System.out.println(Arrays.toString(dig));
		
	}
}
