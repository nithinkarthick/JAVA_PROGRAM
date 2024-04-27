package com.banking1;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Account {
    private String customerId;
    private String password;
    private double balance;
    private Map<String, GiftCard> giftCards;

    public Account(String customerId, String password, double balance) {
        this.customerId = customerId;
        this.password = encryptPassword(password);
        this.setBalance(balance);
        this.setGiftCards(new HashMap<>());
    }

    private String encryptPassword(String password) {
        StringBuilder encryptedPassword = new StringBuilder();
        for (char c : password.toCharArray()) {
            encryptedPassword.append((char) (c + 1));
        }
        return encryptedPassword.toString();
    }

    public boolean login(String customerId, String password) {
        if (this.customerId.equals(customerId) && this.password.equals(encryptPassword(password))) {
            System.out.println("Login successful!");
            return true;
        } else {
            System.out.println("Invalid customer ID or password.");
            return false;
        }
    }

    public void printAccountDetails() {
        System.out.println("Customer ID: " + customerId);
        System.out.println("Balance: $" + getBalance());
        System.out.println("Gift Cards:");
        for (GiftCard card : getGiftCards().values()) {
            System.out.println(card);
        }
    }


    public void createGiftCard() {
        GiftCard giftCard = new GiftCard();
        getGiftCards().put(giftCard.getCardNumber(), giftCard);
        System.out.println("Gift card created: " + giftCard);
    }

    public boolean purchaseFromGiftCard(String cardNumber, String pinNumber, double amount) {
        GiftCard giftCard = getGiftCards().get(cardNumber);
        if (giftCard != null && !giftCard.isBlocked() && giftCard.getPinNumber().equals(pinNumber)) {
            if (amount <= giftCard.getBalance()) {
                giftCard.setBalance(giftCard.getBalance() - amount);
                giftCard.addTransaction(new Transaction("Purchase", amount, giftCard.getBalance()));
                System.out.println("Purchase successful. Remaining balance: $" + giftCard.getBalance());
                return true;
            } else {
                System.out.println("Insufficient balance.");
            }
        } else {
            System.out.println("Invalid card number, pin number, or card is blocked.");
        }
        return false;
    }

    public boolean topupGiftCard(String cardNumber, double amount) {
        GiftCard giftCard = getGiftCards().get(cardNumber);
        if (giftCard != null && !giftCard.isBlocked()) {
            if (amount <= getBalance()) {
                setBalance(getBalance() - amount);
                giftCard.setBalance(giftCard.getBalance() + amount);
                giftCard.addTransaction(new Transaction("Topup", amount, giftCard.getBalance()));
                System.out.println("Topup successful. New gift card balance: $" + giftCard.getBalance());
                return true;
            } else {
                System.out.println("Insufficient main account balance.");
            }
        } else {
            System.out.println("Invalid card number or card is blocked.");
        }
        return false;
    }

    public void printTransactionHistory(String cardNumber) {
        GiftCard giftCard = getGiftCards().get(cardNumber);
        if (giftCard != null) {
            giftCard.printTransactionHistory();
        } else {
            System.out.println("Gift card not found.");
        }
    }

    public boolean blockGiftCard(String cardNumber) {
        GiftCard giftCard = getGiftCards().get(cardNumber);
        if (giftCard != null) {
            giftCard.setBlocked(true);
            setBalance(getBalance() + giftCard.getBalance());
            giftCard.setBalance(0);
            System.out.println("Gift card blocked successfully. Balance transferred to main account.");
            return true;
        } else {
            System.out.println("Gift card not found.");
            return false;
        }
    }

	public Map<String, GiftCard> getGiftCards() {
		return giftCards;
	}

	public void setGiftCards(Map<String, GiftCard> giftCards) {
		this.giftCards = giftCards;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
    
    // Other methods for gift card management, transactions, etc.
}