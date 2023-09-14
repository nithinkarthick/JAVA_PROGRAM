package com.example.java;

import java.util.Arrays;

public class AlternateSorting {

	
	public static void main(String[] args) {
		
		int[] arr = {1,2,4,5,7,8,6};
		
		Arrays.sort(arr);
		
		int n = arr.length;
		int min =0;
		int max  = n-1;
		int[] result = new int[n];
		boolean toggle = true;
		
		for(int i=0 ; i<n ; i++) {
			if(toggle) {
				result[i]=arr[max--];
			}else {
				result[i]=arr[min++];
			}
			
			toggle = !toggle;
		}
		
		for(int digit : result) {
			System.out.print(digit+" ");
		}
		
	}
	
}
