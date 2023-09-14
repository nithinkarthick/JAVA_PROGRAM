package com.example.java;

import java.util.Scanner;

public class AddingTwoArray {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int[] num1 = new int[n1];
		
		for(int i=0 ; i<n1 ; i++) {
			 num1[i] = sc.nextInt();
			
		}
		int n2 = sc.nextInt();
		int num2[] = new int[n2];
		
		for(int i=0 ; i<n2 ; i++) {
			num2[i] = sc.nextInt();
		}
		
		
		int max = Math.max(n1, n2)+1;
		int[] result = new int[max];
		int i = n1-1;
		int j = n2-1;
		int k = max-1;
		int carry = 0;
		
		while(i>=0 || j>=0) {
			
			int sum = carry;
			if(i>=0) {
				sum += num1[i];
				i--;
			}
			
			if(j>=0) {
				sum += num2[j];
				j--;
			}
			
			result[k] = sum % 10;
			carry = sum / 10;
			k--;
		}
	
		for(int digit : result) {
			System.out.print(digit+ " ");
		}
	}
}
