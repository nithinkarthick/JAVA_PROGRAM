package com.example.java;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UnionSet {

	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int[] arr1 = new int[n1];
		
		for(int i =0 ; i<n1 ; i++) {
			arr1[i] = sc.nextInt();
		}
		
		int n2 = sc.nextInt();
		int[] arr2 = new int[n1];
		
		for(int i =0 ; i<n2 ; i++) {
			arr2[i] = sc.nextInt();
		}
		
		
		Set<Integer> unionSet = new HashSet<Integer>();
		
		for(int u1 : arr1) {
			unionSet.add(u1);
		}
		for(int u2 : arr2) {
			unionSet.add(u2);
		}
		
		
		for(int val : unionSet)
		{
			System.out.print(val+" ");
		}
		
		
	}
	
	
	
}
