package com.trainbooking2.app;

public class Passenger {

	
	static int id =1;
	String name;
	int age;
	String berthPreference;
	int passengerId;
	String alloted; // berth(U,L,M,RAC,WL)
	int number; //seat number
	
	
	public Passenger(String name, int age, String berthPreference) {
		this.name = name;
		this.age = age;
		this.berthPreference = berthPreference;
		this.passengerId = id++;
		alloted = "";
		number = -1;
		
	}
}
