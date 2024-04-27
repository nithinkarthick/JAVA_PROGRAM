package com.banking1;

class Transaction {
    private String type;
    private double amount;
    private double balance;

    

    public Transaction(String type, double amount, double balance) {
		super();
		this.type = type;
		this.amount = amount;
		this.balance = balance;
	}



	@Override
    public String toString() {
        return type + ": $" + amount + ", Balance: $" + balance;
    }
}
