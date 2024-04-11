package com.example.java;

import java.util.HashMap;
import java.util.Map;

public class SingleNumberInArray {

	
	public static void main(String[] args) {
		
		  int a[]={12, 1, 12, 3, 12, 1, 1, 2, 3, 2, 2, 3, 7};
		     
		    // size of the array
		    int N= a.length;
		     
		    System.out.println(singleNumber(a, N));
	}
	
	public static int singleNumber(int[] num , int n ) {
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i : num) {
			if(map.containsKey(i)) {
				map.put(i, map.getOrDefault(i, 0)+1);
			}else {
				map.put(i, 1);
			}
		}
		
		for(Map.Entry<Integer, Integer> m : map.entrySet()) {
			if(m.getValue()==1){
				return m.getKey();
			}
		}
		
		return -1;
	}
}
