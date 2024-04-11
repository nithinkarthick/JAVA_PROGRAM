package com.example.java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class PrintDuplicateChar {

	
	public static void main(String[] args) {
		
		duplicate("programming");
	}
	
	
	public static void duplicate(String str) {
		
		char[] ch = str.toCharArray();
		
		Map<Character, Integer> map = new HashMap<>();
		
		for(char c : ch) {
			
			if(map.containsKey(c)) {
				
				map.put(c, map.getOrDefault(c,0)+1);
			}else {
				map.put(c, 1);
			}
		}
		
			
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			
			if(entry.getValue()>1) {
				System.out.println(entry.getKey()+ " : "+entry.getValue());
			}
		}
		
//		Iterator<Entry<Character, Integer>> it = map.entrySet().iterator();
//		while(it.hasNext()) {
//			
//		}
		
	}
}
