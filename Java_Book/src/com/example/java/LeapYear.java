package com.example.java;

public class LeapYear {

	
	 public static boolean doesLeapYear(int year){
	       return (year%400 == 0) || ((year%100) != 0 && (year%4 == 0));
	   }
	 
	 
	 public static void main(String[] args) {
		
		 int year = 2000;
		 System.out.println(doesLeapYear(year));
		 
		 
		 System.out.println((year%400 == 0) || ((year%100) != 0 && (year%4 == 0)));
	}
}
