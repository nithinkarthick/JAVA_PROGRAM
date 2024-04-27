package com.banking1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class GiftCard {
    private String cardNumber;
    private String pinNumber;
    private double balance;
    private boolean isBlocked;
    private List<Transaction> transactions;

    public GiftCard() {
        this.cardNumber = generateCardNumber();
        this.pinNumber = generatePinNumber();
        this.balance = 0;
        this.isBlocked = false;
        this.transactions = new ArrayList<>();
    }

    private String generateCardNumber() {
        Random random = new Random();
        StringBuilder cardNumber = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            cardNumber.append(random.nextInt(10));
        }
        return cardNumber.toString();
    }

    private String generatePinNumber() {
        Random random = new Random();
        StringBuilder pinNumber = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            pinNumber.append(random.nextInt(10));
        }
        return pinNumber.toString();
    }

    // Getters and setters

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public void printTransactionHistory() {
        System.out.println("Transaction History:");
        for (Transaction transaction : transactions) {
            System.out.println(transaction);
        }
    }
    
    // Other methods for topup, block, purchase, etc.

    @Override
    public String toString() {
        return "Gift Card [cardNumber=" + cardNumber + ", balance=$" + balance + ", isBlocked=" + isBlocked + "]";
    }

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getPinNumber() {
		return pinNumber;
	}

	public void setPinNumber(String pinNumber) {
		this.pinNumber = pinNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	boolean isBlocked() {
		return isBlocked;
	}

	public void setBlocked(boolean isBlocked) {
		this.isBlocked = isBlocked;
	}

	public List<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}
    
    
    
}
