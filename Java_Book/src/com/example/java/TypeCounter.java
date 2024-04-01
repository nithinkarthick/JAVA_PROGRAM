package com.example.java;

import java.util.ArrayList;
import java.util.List;

public class TypeCounter {

	public static void main(String[] args) {
		countTypesInString();
	}
	
	 public static void countTypesInString() {
	        String str = "Hello my 50 name 4.5 is James, I 20 years old and i have 5.7 coins";
	        String[] vetStr = str.split("\\s+");

	        List<Integer> listInt = new ArrayList<>();
	        List<Float> listFloat = new ArrayList<>();
	        List<String> listStr = new ArrayList<>();
	        for (String s : vetStr) {
	            try {
	                listInt.add(Integer.parseInt(s));
	            } catch (NumberFormatException exInt) {
	                try {
	                    listFloat.add(Float.parseFloat(s));
	                } catch (NumberFormatException exFloat) {
	                    listStr.add(s);
	                }
	            }
	        }
	        

	        System.out.println("Number of ints: " + listInt.size());
	        System.out.println("Number of floats: " + listFloat.size());
	        System.out.println("Number of strings: " + listStr.size());
	    }
	 
}
