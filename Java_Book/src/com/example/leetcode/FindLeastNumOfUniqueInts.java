package com.example.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class FindLeastNumOfUniqueInts {

	public static void main(String[] args) {
		
		
	}
	
	 public int findLeastNumOfUniqueInts(int[] arr, int k) {
	     
	        Map<Integer, Integer> h = new HashMap<>();

	        for(int x : arr){
	           
	                h.put(x, h.getOrDefault(x, 0)+1);
	           
	        }
	        List<Map.Entry<Integer, Integer>> element = new ArrayList<>(h.entrySet());
	        element.sort((a,b) -> a.getValue() - b.getValue());

	        for(Map.Entry<Integer, Integer> entry : element){
	            if(entry.getValue() <= k){
	                k -= entry.getValue();
	                h.remove(entry.getKey());
	            }else{
	                break;
	            }
	        }
	        return h.size();
	    }
	 
	 
	 
	 public int findLeastNumOfUniqueInts2(int[] arr, int k) {

	        Map<Integer,Integer> f = new HashMap<>();
	        
	        for(int n: arr){
	                f.put(n,f.getOrDefault(n,0)+1);
	        }

	        PriorityQueue<Integer> minH = new PriorityQueue<>();

	        for(int i:f.values()){
	            minH.add(i);
	        }

	        while(k>0){
	            int top=minH.peek();
	            k-=top;
	            if(k >= 0) minH.poll();
	            
	        }

	        return minH.size();
	        
	    }
	 
	 
//	 
//	 Given an array of integers arr and an integer k. Find the least number of unique integers after removing exactly k elements.
//
//	 
//
//	 Example 1:
//
//	 Input: arr = [5,5,4], k = 1
//	 Output: 1
//	 Explanation: Remove the single 4, only 5 is left.
//	 Example 2:
//	 Input: arr = [4,3,1,1,3,3,2], k = 3
//	 Output: 2
//	 Explanation: Remove 4, 2 and either one of the two 1s or three 3s. 1 and 3 will be left.
	 
	 
}
