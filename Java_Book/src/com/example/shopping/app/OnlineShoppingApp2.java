package com.shopping.app;

import java.util.*;

public class OnlineShoppingApp2 {
    private static HashMap<String, String> userCredentials = new HashMap<>();
    private static ArrayList<Manager> managers = new ArrayList<>();
    private static HashMap<String, Inventory> inventories = new HashMap<>();

    public static void main(String[] args) {
        createUser("admin", EncyptionPassword.encrypt("admin123"));
        createManager("manager", EncyptionPassword.encrypt("manager123"));

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (authenticateUser(username, password)) {
            System.out.println("User authenticated successfully!");

            while (true) {
                displayMenu();
                int choice = scanner.nextInt();
                scanner.nextLine(); // consume newline character

                switch (choice) {
                    case 1:
                        changePassword(username);
                        break;
                    case 2:
                        updateProfile(username);
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
                        System.out.println("Logging out...");
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
            }
        } else {
            System.out.println("Authentication failed. Invalid credentials.");
        }
    }

    private static void displayMenu() {
        System.out.println("1. Change password");
        System.out.println("2. Update profile");
        System.out.println("3. Create manager");
        System.out.println("4. Update manager");
        System.out.println("5. Remove manager");
        System.out.println("6. Add inventory");
        System.out.println("7. Update inventory");
        System.out.println("8. Remove inventory");
        System.out.println("9. View inventory");
        System.out.println("10. Log out");
        System.out.print("Enter your choice: ");
    }

    private static void changePassword(String username) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter new password: ");
        String newPassword = scanner.nextLine();
        String encryptedPassword = EncyptionPassword.encrypt(newPassword);
        if (updateUser(username, encryptedPassword)) {
            System.out.println("Password updated successfully for user: " + username);
        } else {
            System.out.println("Password update failed.");
        }
    }

    private static void updateProfile(String username) {
    	Scanner scanner = new Scanner(System.in);
//    	  if (userCredentials.containsKey(username)) {
//    		  System.out.println("Enter new user name (if don't want to click enter.");
//    		  String updateUsername = scanner.next();
//    		  	if(!updateUsername.isEmpty()) {
//    		  		userCredentials.put(updateUsername, newPassword);
//    		  	}
//    		  String password = scanner.next();
//              userCredentials.put(username, newPassword);
//              System.out.println("updated successfully!");
//          } else {
//             System.out.println("user name not found!");
//          }
    
    }

    private static void createManager() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter manager name: ");
        String managerName = scanner.nextLine();
        System.out.print("Enter manager password: ");
        String managerPassword = scanner.nextLine();
        String encryptedPassword = EncyptionPassword.encrypt(managerPassword);
        createManager(managerName, encryptedPassword);
        System.out.println("Manager created: " + managerName);
    }

    private static void updateManager() {
        // TODO: Implement manager update functionality
        System.out.println("Manager update functionality not implemented yet.");
    }

    private static void removeManager() {
        // TODO: Implement manager removal functionality
        System.out.println("Manager removal functionality not implemented yet.");
    }

    private static void addInventory() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter item name: ");
        String itemName = scanner.nextLine();
        System.out.print("Enter item quantity: ");
        int quantity = scanner.nextInt();
        System.out.print("Enter item price: ");
        double itemPrice = scanner.nextDouble();
        scanner.nextLine(); // consume newline character
        Inventory inventory = new Inventory(itemName,quantity,  itemPrice);
        addInventory(itemName, inventory);
        System.out.println("Inventory added: " + itemName);
    }

    private static void updateInventory() {

    
    	 Scanner scanner = new Scanner(System.in);
    	    System.out.print("Enter the item name to update: ");
    	    String itemName = scanner.nextLine();

    	    if (inventories.containsKey(itemName)) {
    	        Inventory inventory = inventories.get(itemName);

    	        System.out.print("Enter the new name (or press Enter to keep the current name): ");
    	        String newName = scanner.nextLine();
    	        if (!newName.isEmpty()) {
    	            inventory.setName(newName);
    	        }

    	        System.out.print("Enter the new quantity (or press Enter to keep the current quantity): ");
    	        String newQuantityStr = scanner.nextLine();
    	        if (!newQuantityStr.isEmpty()) {
    	            int newQuantity = Integer.parseInt(newQuantityStr);
    	            inventory.setQuantity(newQuantity);
    	        }

    	        System.out.print("Enter the new price (or press Enter to keep the current price): ");
    	        String newPriceStr = scanner.nextLine();
    	        if (!newPriceStr.isEmpty()) {
    	            double newPrice = Double.parseDouble(newPriceStr);
    	            inventory.setPrice(newPrice);
    	        }

    	        inventories.put(itemName, inventory);
    	        System.out.println("Inventory item '" + itemName + "' has been updated successfully.");
    	    } else {
    	        System.out.println("Inventory item '" + itemName + "' not found.");
    	    }
    	    
    
    }

    private static void removeInventory() {
        // TODO: Implement inventory removal functionality
    	 Scanner scanner = new Scanner(System.in);
    	 System.out.println("Enter product Name:");
    	String productName = scanner.next();
       if( inventories.get(productName)!=null) {
    	   inventories.remove(productName);
    	   System.out.println("Prodcuct removed from inventory!");
       }else {
    	   System.out.println("No product found!");
       }
        
    }

    private static void viewInventory() {
        // TODO: Implement inventory viewing functionality
    	System.out.println("Inventory Details:");
        for (Map.Entry<String, Inventory> map : inventories.entrySet()) {
            System.out.println(map.getValue());
        }
    }

    private static void createUser(String username, String password) {
        userCredentials.put(username, password);
    }

    private static void createManager(String username, String password) {
        managers.add(new Manager(username, password));
    }

    private static boolean authenticateUser(String username, String password) {
        if (userCredentials.containsKey(username)) {
            String storedPassword = userCredentials.get(username);
            return storedPassword.equals(EncyptionPassword.encrypt(password));
        }
        return false;
    }

    private static boolean updateUser(String username, String newPassword) {
        if (userCredentials.containsKey(username)) {
            userCredentials.put(username, newPassword);
            return true;
        } else {
            return false;
        }
    }

    private static void addInventory(String itemName, Inventory inventory) {
        inventories.put(itemName, inventory);
    }

    


  
}