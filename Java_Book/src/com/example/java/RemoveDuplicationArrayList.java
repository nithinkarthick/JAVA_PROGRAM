package com.example.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicationArrayList {

	
	public static void main(String[] args) {
		
		List<String> arrayList = new ArrayList<>();
		
		arrayList.add("apple");
		arrayList.add("banana");
		arrayList.add("apple");
		
		LinkedHashSet<String> removeDup = new LinkedHashSet<>(arrayList);
		
		
		arrayList.clear();
		
		arrayList = new ArrayList<>(removeDup);
		
		System.out.println(arrayList);
		
		  // Remove duplicates using Java 8 Stream API
        List<String> listWithoutDuplicates = arrayList.stream().distinct().collect(Collectors.toList());

        
	}
}
