package com.example.java;

import java.util.Scanner;

public class ArrayAddition {

	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		
		long sum = 0;
		
		for(int i=0 ; i<n ; i++) {
			String[] array = sc.nextLine().split(" ");
			
			for(String arr : array) {
				sum = sum + Integer.parseInt(arr);
			}
		}
		
		System.out.println("result: "+sum);
	}
	
	
	
}
