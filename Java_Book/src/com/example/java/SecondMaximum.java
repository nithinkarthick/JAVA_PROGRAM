package com.example.java;

import java.util.Scanner;

public class SecondMaximum {

	
	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0 ; i<n ; i++) {
			arr[i] = sc.nextInt();
		}
		
		int firstMin = Integer.MIN_VALUE;
		int secMin = Integer.MIN_VALUE;
		
		for(int num : arr) {
			if(num>firstMin) {
				secMin = firstMin;
				firstMin = num;
			}else if(num > secMin && num!=firstMin) {
				secMin=num;
			}
		}
		
		System.out.println(secMin);
	}
	
	
}
