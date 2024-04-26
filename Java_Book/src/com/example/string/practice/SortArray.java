package com.string.practice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortArray {
	
	public static void main(String[] args) {
		
		int[] arr = {1,3,346,6,3,22,2,5,6,7};
		
		ascending(arr);
		System.out.println("asc : "+Arrays.toString(arr));
		
		
		descending(arr);
		System.out.println("dsc : "+Arrays.toString(arr));
		
		
	}
	public static void ascending(int[] arr) {
	    int n = arr.length;

	    for (int i = 0; i < n - 1; i++) {
	        for (int j = 0; j < n - i - 1; j++) {
	            if (arr[j] > arr[j + 1]) {
	                int temp = arr[j];
	                arr[j] = arr[j + 1];
	                arr[j + 1] = temp;
	            }
	        }
	    }
	}

	public static void descending(int[] arr) {
	    int n = arr.length;

	    for (int i = 0; i < n - 1; i++) {
	        for (int j = 0; j < n - i - 1; j++) {
	            if (arr[j] < arr[j + 1]) {
	                int temp = arr[j];
	                arr[j] = arr[j + 1];
	                arr[j + 1] = temp;
	            }
	        }
	    }
	}

}
