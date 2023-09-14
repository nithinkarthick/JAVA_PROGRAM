package com.example.java;

import java.util.Scanner;

public class FindEvenOdd {

	
	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		
		int even =0;
		int odd=0;
		
		while(n >0) {
			long digit = n%10;
			if(digit%2==0) {
				even++;
			}else {
				odd++;
			}
			
			n = n/10;
		}
		
		System.out.println("even: "+even);
		System.out.println("odd: "+odd);
		
	}
}
