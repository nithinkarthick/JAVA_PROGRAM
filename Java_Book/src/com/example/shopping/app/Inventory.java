package com.shopping.app;

public class Inventory {

	private static int idCount = 1;
	int id;
	String name;
	int quantity;
	double price;
	
	public Inventory(String name, int quantity, double price) {
		this.id = idCount++;
		this.name=name;
		this.quantity=quantity;
		this.price=price;
	}
	
	@Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Quantity: " + quantity + ", Price: " + price;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
}
