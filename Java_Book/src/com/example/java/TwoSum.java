package com.example.java;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

	
	public static void main(String[] args) {
		
		int[] num = {3,2,1,5};
		int target = 8;
		
		System.out.println(Arrays.toString(twosum(num, target)));
				
	}
	
	public static int[] twosum(int[] num, int target) {
		
		for(int i=1 ; i<num.length;i++) {
			System.out.println("i:"+i+" - "+num[i]);
			for(int j=i ; j<num.length;j++) {
				System.out.println("j: "+j+" - "+num[j]);
				if(num[j] + num[j-i] == target) {
					System.out.println(num[j]+ " and "+num[j-i]+" ---here i:"+i+" and j:"+j);
					return new int[] {j-i, j};
				}
			}
		}
		return null;
	}
	
	
	// method 2 
	public static int[] hashMethod(int[] num, int target) {
		HashMap<Integer, Integer> map = new HashMap<>();
				int comp = 0;
				for(int i=0 ;i<num.length;i++) {
					comp = target - num[i];
					
					if(map.containsKey(comp)) {
						return new int[] {map.get(comp), i};
					}
					else {
						map.put(num[i], i);
					}
					
				}
				return null;
				
	}
	
	
	
	
	public static int[] twosum_2(int[] nums, int target) {
		
		
	 for(int i=1;i<nums.length;i++){
         for(int j=i;j<nums.length;j++){
             if(nums[j] + nums[j-i] == target){
                 return new int[]{j, j-i};
             }
         }
     }
     

     return null;
	}
     
     
}
