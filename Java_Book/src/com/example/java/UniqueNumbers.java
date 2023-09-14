package com.example.java;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueNumbers {

	
	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] num = new int[n];
		for(int i=0 ;i<n ;i++) {
			num[i] = sc.nextInt();
		}
		
		Set<Integer> uniq = new HashSet<Integer>();
		for(int n1 : num) {
			uniq.add(n1);
		}
		
		for(int val : uniq) {
			System.out.print(val+" ");
		}
	}
	
	
	
}
