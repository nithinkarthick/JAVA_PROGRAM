package com.example.java;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PosAndNegRearrageArray {

	
	public static void main(String[] args) {
		
		
		int[] num = {1,4,6,-2,-5,4,-6};
		
		System.out.println("input: "+Arrays.toString(num));
		
		List<Integer> pos  = new ArrayList<Integer>();
		List<Integer> neg  = new ArrayList<Integer>();
	
		for(int i : num) {
			if(i<0) {
				neg.add(i);
			}else {
				pos.add(i);
			}
		}
		
		for(int i =0 ,d=0 ;i<num.length ; i++) {
			if(i%2==0) {
				num[d] = pos.get(i/2);
			}else {
				num[d] = neg.get(i/2);
			}
			d = d+1;
		}
		
		System.out.println("ouput: "+Arrays.toString(num));
		
	}
}
