package com.example.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

public class SortArrayList {

	
	public static void main(String[] args) {
		
		 ArrayList<Integer> numbers = new ArrayList<>();
	        numbers.add(5);
	        numbers.add(2);
	        numbers.add(8);
	        numbers.add(1);
	        numbers.add(10);
	        
	        Collections.sort(numbers, Collections.reverseOrder());

	        Collections.synchronizedList(numbers);
	        
	        System.out.println(numbers);
	        
	        numbers.forEach( (temp) -> {System.out.println(temp); } );
	        
	}
}
