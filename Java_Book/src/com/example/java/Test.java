package com.example.java;

import java.util.HashSet;

public class Test {

	
	public static void main(String[] args) {
		
		/*
		 * String s1 = "java"; String s2 = s1; System.out.println(s1==s2); s1 =
		 * "python"; System.out.println(s1==s2);
		 */
		
		// create text block in java
		String textBlock = """
				{
				 "PANNO":"CCYPN9764N",
				 "POSCODE":"ECS",
				 "TOKEN":"C3F06D3D-C8A4-4F5D-AAED-2C7C0DBC44A4"
				}
					""";
		
		System.out.println(textBlock);
		
	//	Runnable r1 = () -> System.out.println("My Runnable");
//		String s3 = "JournalDev";
//		int start = 1;
//		char end = 5;
//
//		System.out.println(s3.substring(start, end));
		
		HashSet shortSet = new HashSet();

		for (short i = 0; i < 100; i++) {
			shortSet.add(i);
			shortSet.remove(i - 1);
	}

	System.out.println(shortSet.size());
	
	}
	
	public record demo() {
		
	}
}
