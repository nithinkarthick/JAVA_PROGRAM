package com.example.java;

import java.util.HashMap;
import java.util.Map;

public class DistinctCharacters {

	
	public static void main(String args[]) {
		
		String input = "aabbsccddrrffeey";
		
		char[] ch = input.toCharArray();
		
		Map<Character, Integer> result = new HashMap<>();
		
		for(char c : ch) {
			if(result.containsKey(c)) {
				result.put(c, result.get(c)+1);
			}else {
				result.put(c, 1);
			}
		}
			
		System.out.println(result);
	}
}
