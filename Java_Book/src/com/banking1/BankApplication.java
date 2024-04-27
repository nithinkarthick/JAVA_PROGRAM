package com.banking1;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BankApplication {
    private static Map<String, Account> accounts = new HashMap<>();

    public static void main(String[] args) {
        // Initialize accounts
        accounts.put("customer1", new Account("customer1", "password1", 1000));
        accounts.put("customer2", new Account("customer2", "password2", 2000));
        accounts.put("customer3", new Account("customer3", "password3", 3000));

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("1. Account Login");
            System.out.println("2. Purchase");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    handleAccountLogin(scanner);
                    break;
                case 2:
                    handlePurchase(scanner);
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }

            System.out.print("Do you want to exit? (y/n): ");
            String exitChoice = scanner.next();
            exit = exitChoice.equalsIgnoreCase("y");
        }

        scanner.close();
    }

    private static void handleAccountLogin(Scanner scanner) {
        System.out.print("Enter customer ID: ");
        String customerId = scanner.next();
        System.out.print("Enter password: ");
        String password = scanner.next();

        Account account = accounts.get(customerId);
        if (account != null && account.login(customerId, password)) {
            // Logged in successfully
            handleAccountOptions(scanner, account);
        } else {
            System.out.println("Invalid customer ID or password.");
        }
    }

    private static void handleAccountOptions(Scanner scanner, Account account) {
        boolean exit = false;

        while (!exit) {
            System.out.println("1. Create Gift Card");
            System.out.println("2. Topup");
            System.out.println("3. Transaction History");
            System.out.println("4. Block");
            System.out.println("5. Logout");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    handleCreateGiftCard(account);
                    break;
                case 2:
                    handleTopup(scanner, account);
                    break;
                case 3:
                    handleTransactionHistory(scanner, account);
                    break;
                case 4:
                    handleBlockCard(scanner, account);
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
            if (!exit) {
                System.out.print("Do you want to go back to the main menu? (y/n): ");
                String backChoice = scanner.next();
                if (backChoice.equalsIgnoreCase("y")) {
                    break;
                }
            }
        }
    }

    private static void handleCreateGiftCard(Account account) {
        GiftCard giftCard = new GiftCard();
        account.getGiftCards().put(giftCard.getCardNumber(), giftCard);
        System.out.println("Gift card created: " + giftCard);
    }
    
    private static void handlePurchase(Scanner scanner) {
        System.out.print("Enter gift card number: ");
        String cardNumber = scanner.next();
        System.out.print("Enter pin number: ");
        String pinNumber = scanner.next();

        Account account = findAccountByCardNumber(cardNumber);
        if (account != null) {
            GiftCard giftCard = account.getGiftCards().get(cardNumber);
            if (giftCard != null && !giftCard.isBlocked() && giftCard.getPinNumber().equals(pinNumber)) {
                System.out.print("Enter purchase amount: ");
                double purchaseAmount = scanner.nextDouble();
                if (purchaseAmount <= giftCard.getBalance()) {
                    giftCard.setBalance(giftCard.getBalance() - purchaseAmount);
                    giftCard.addTransaction(new Transaction("Purchase", purchaseAmount, giftCard.getBalance()));
                    System.out.println("Purchase successful. Remaining balance: $" + giftCard.getBalance());
                } else {
                    System.out.println("Insufficient balance.");
                }
            } else {
                System.out.println("Invalid card number, pin number, or card is blocked.");
            }
        } else {
            System.out.println("Gift card not found.");
        }
    }

    private static void handleTopup(Scanner scanner, Account account) {
        System.out.print("Enter gift card number: ");
        String cardNumber = scanner.next();

        GiftCard giftCard = account.getGiftCards().get(cardNumber);
        if (giftCard != null && !giftCard.isBlocked()) {
            System.out.print("Enter topup amount: ");
            double topupAmount = scanner.nextDouble();
            if (topupAmount <= account.getBalance()) {
                account.setBalance(account.getBalance() - topupAmount);
                giftCard.setBalance(giftCard.getBalance() + topupAmount);
                giftCard.addTransaction(new Transaction("Topup", topupAmount, giftCard.getBalance()));
                System.out.println("Topup successful. New gift card balance: $" + giftCard.getBalance());
            } else {
                System.out.println("Insufficient main account balance.");
            }
        } else {
            System.out.println("Invalid card number or card is blocked.");
        }
    }

    private static void handleTransactionHistory(Scanner scanner, Account account) {
        System.out.print("Enter gift card number: ");
        String cardNumber = scanner.next();

        GiftCard giftCard = account.getGiftCards().get(cardNumber);
        if (giftCard != null) {
            giftCard.printTransactionHistory();
        } else {
            System.out.println("Gift card not found.");
        }
    }

    private static void handleBlockCard(Scanner scanner, Account account) {
        System.out.print("Enter gift card number: ");
        String cardNumber = scanner.next();

        GiftCard giftCard = account.getGiftCards().get(cardNumber);
        if (giftCard != null) {
            giftCard.setBlocked(true);
            account.setBalance(account.getBalance() + giftCard.getBalance());
            giftCard.setBalance(0);
            System.out.println("Gift card blocked successfully. Balance transferred to main account.");
        } else {
            System.out.println("Gift card not found.");
        }
    }

    private static Account findAccountByCardNumber(String cardNumber) {
        for (Account account : accounts.values()) {
            if (account.getGiftCards().containsKey(cardNumber)) {
                return account;
            }
        }
        return null;
    }
    
    
}
    