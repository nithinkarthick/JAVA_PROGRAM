package com.shopping.app;

public class Manager {

	private int idCounter = 1;
	int id ;
	String name;
	String role;
	
	
	public Manager(String name, String role) {
		this.id = idCounter++;
		this.name=name;
		this.role = role;
	}
}
