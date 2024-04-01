package com.example.java;

import java.util.HashMap;

public class FinalCountWordsHash {

	public static void main(String[] args) {


	
	String str = "this this is is a a sample test test";

	String[] split = str.split(" ");
	
	HashMap<String, Integer> map = new HashMap<String, Integer>();
	
	

	for( int i =0 ; i< split.length ; i++) {
		if(map.containsKey(split[i])) {
			int count = map.get(split[i]);
	//		map.put(split[i], count+1);
			map.put(split[i], map.getOrDefault(split[i], 0)+1);
		}else {
			map.put(split[i], 1);
		}
	}

	System.out.println(map);
	
	
	}
}
