package com.shopping.app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class OnlineShoppingApp {
    
    private static HashMap<String, String> userCredentials = new HashMap<>();
  //  private static HashMap<String, Integer> inventory = new HashMap<>();
    private static ArrayList<Inventory> inventory = new ArrayList<>();
    
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        createUser("admin", "benjo");
        login();
    }
    
    public static void login() {
        System.out.println("Enter username: ");
        String usernameToCheck = sc.nextLine();
        
        System.out.println("Enter your password: ");
        String passwordToCheck = sc.nextLine();
        
        if (authenticateUser(usernameToCheck, passwordToCheck)) {
            System.out.println("User authenticated successfully!");
            while (true) {
                displayMenu();
                int choice = sc.nextInt();
                sc.nextLine(); // Consume newline character
                switch (choice) {
                    case 1:
                        changePassword(usernameToCheck);
                        break;
                    case 2:
                        updateProfile(usernameToCheck);
                        break;
                    case 3:
                        createManager();
                        break;
                    case 4:
                        updateManager();
                        break;
                    case 5:
                        removeManager();
                        break;
                    case 6:
                        addInventory();
                        break;
                    case 7:
                        updateInventory();
                        break;
                    case 8:
                        removeInventory();
                        break;
                    case 9:
                        viewInventory();
                        break;
                    case 10:
                        logout();
                        return;
                    default:
                        System.out.println("Invalid choice! Please enter again.");
                }
            }
        } else {
            System.out.println("Authentication failed. Invalid credentials.");
        }
    }
    
    public static void displayMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Change Password");
        System.out.println("2. Update Profile");
        System.out.println("3. Create Manager");
        System.out.println("4. Update Manager");
        System.out.println("5. Remove Manager");
        System.out.println("6. Add Inventory");
        System.out.println("7. Update Inventory");
        System.out.println("8. Remove Inventory");
        System.out.println("9. View Inventory");
        System.out.println("10. Logout");
        System.out.println("Enter your choice: ");
    }
    
    public static void changePassword(String username) {
        System.out.println("Enter new password: ");
        String newPassword = sc.nextLine();
        userCredentials.put(username, newPassword);
        System.out.println("Password changed successfully!");
    }
    
    public static void updateProfile(String username) {
        // Implement profile update functionality here
        System.out.println("Profile updated successfully!");
    }
    
    public static void createManager() {
        // Implement manager creation functionality here
        System.out.println("Manager created successfully!");
    }
    
    public static void updateManager() {
        // Implement manager update functionality here
        System.out.println("Manager updated successfully!");
    }
    
    public static void removeManager() {
        // Implement manager removal functionality here
        System.out.println("Manager removed successfully!");
    }
    
    public static void addInventory() {
        // Implement inventory addition functionality here
        System.out.println("Inventory added successfully!");
    }
    
    public static void updateInventory() {
        // Implement inventory update functionality here
        System.out.println("Inventory updated successfully!");
    }
    
    public static void removeInventory() {
        // Implement inventory removal functionality here
        System.out.println("Inventory removed successfully!");
    }
    
    public static void viewInventory() {
        // Implement inventory viewing functionality here
        System.out.println("Inventory viewed successfully!");
    }
    
    public static void logout() {
        System.out.println("Logged out successfully!");
    }
    
    public static void createUser(String username, String password) {
        userCredentials.put(username, password);
    }
    
    public static boolean authenticateUser(String username, String password) {
        return userCredentials.containsKey(username) && userCredentials.get(username).equals(password);
    }
}
