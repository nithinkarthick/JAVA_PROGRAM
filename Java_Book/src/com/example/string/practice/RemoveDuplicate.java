package com.string.practice;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicate {

	
	public static void main(String[] args) {
		
		int[] arr = {1,2,2,3,3,4,4,5,6,7,8};
		
		LinkedHashSet<Integer> hash = new LinkedHashSet<Integer>();
		
		for(int n : arr) {
			hash.add(n);
		}
		
		int i = 0;
		for(Integer n : hash) {
			arr[i] = n;
			i++;
		}
		
		System.out.println("arr: "+Arrays.toString(arr));
		
	}
}
