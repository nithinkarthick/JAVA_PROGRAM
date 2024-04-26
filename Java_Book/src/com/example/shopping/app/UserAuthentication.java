package com.shopping.app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class UserAuthentication {


	    private static HashMap<String, String> userCredentials = new HashMap<>();
	    

	    private static ArrayList<Manager> manger = new ArrayList<>();

	    public static void main(String[] args) {
	        createUser("admin", EncyptionPassword.encrypt("benjo"));

	        
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.println("Enter username: ");
	        String usernameToCheck = sc.nextLine();
	        
	        System.out.println("Enter your password: ");
	        String passwordToCheck = sc.nextLine();

	        if (authenticateUser(usernameToCheck, passwordToCheck)) {
	            System.out.println("User authenticated successfully!");
	           
	            while(true) {
	            System.out.println("1.Change password\r\n"
						+ "2.Update Profile\r\n"
						+ "3.Create Manager\r\n"
						+ "4.Update Manager\r\n"
						+ "5.Remove Manager\r\n"
						+ "6.Add inventory\r\n"
						+ "7.Update Inventory\r\n"
						+ "8.Remove Inventory\r\n"
						+ "9.View Inventory\r\n"
						+ "10.Log out");
	            
	            System.out.println("******** Enter Type : ");
	            
	            int count = sc.nextInt();
	            
	            switch(count) {
	            
	            
	            case 1:
	            	System.out.println("---Update password---");
	            	
	            	System.out.println("Enter new Password: ");
	            	
	            	String newPassword = sc.next();
	            	
	            	String encPwd = EncyptionPassword.encrypt(newPassword);
	            	
	            	if(updateUser(usernameToCheck, encPwd)) {
	            		
	            		  System.out.println("Password updated successfully for user: " + usernameToCheck);
	            		  
	            	 } else {
	     	            System.out.println("Authentication failed. Invalid credentials.");
	     	        }
	            
	            	break;

	            case 2:
	            	System.out.println("Please enter updated profile");
	            	
	            	
	            	
	            	
//	            	System.out.println("1.Create a manager login\r\n"
//	            		  		+ "2.Add/update a few inventories\r\n"
//	            		  		+ "3.Logout");
//	            		  
//	            		  System.out.println("******** Enter Type : ");
//	            		  
//	            		  int count1 = sc.nextInt();
//	            		  
//	            		  switch(count1) {
//	            		  
	            		  
	            		  case 3:

	            			  System.out.println("--------create manager------");
	            			  
	            			  System.out.println("Enter manager name : ");
	            			  String manager = sc.next();
	            			  System.out.println("Enter manager password : ");
	            			  String mangerPwd = sc.next();
	            			  
	            			  String encPwd1 = EncyptionPassword.encrypt(mangerPwd);
	            			  createUser(manager, encPwd1);
	            			  
	            			  System.out.println("manager created------: "+manager);
	            			  
	            			  break;
	            			  
//	            			  System.out.println("1.Add/update a few inventories\r\n"
//	            			  		+ "	2.Logout");
//	            			  
//	            			  System.out.println("Enter type");
////	            			  int type2 = sc.nextInt();
//	            			  
//	            			  switch(type2) {
	            			  
	            			  case 4:
	            				  System.out.println("udpate manager");
	            			  
	            				  break;
	            				  
	            				  
	            			  case 10:
		            			  System.out.println("------Logged out-----");
		            			  break;
		            			  
		            			  default:
		            				  System.out.println("Invalid type");
	            			  }
	            			  
	            		 
	            			  
	            		  }
	            		  
	            		  
	            	}else {
	            		 System.out.println("User not found. Password update failed.");
	            	}
	            
	            
	        
	    }

	    public static void createUser(String username, String password) {
	       
	    	userCredentials.put(username, password);
	    }

	    public static boolean authenticateUser(String username, String password) {
	    	
	        if (userCredentials.containsKey(username)) {
	        	
	            String storedPassword = userCredentials.get(username);
	            
	            System.out.println("storedPassword: "+storedPassword);
	            
	            if(storedPassword.equals(EncyptionPassword.encrypt(password))) {
	            	return true;
	            }
	            return false;
	            		
	        }
	        return false; 
	    }
	    
	    
	    
	    public static boolean updateUser(String username, String newPassword) {
	        if (userCredentials.containsKey(username)) {
	            userCredentials.put(username, newPassword);
	          
	            return true;
	        } else {
	           
	            return false;
	        }
	    }
	    
	    public static void viewUser(String username, String password) {
	       System.out.println("user details: "+userCredentials);
	    }
	    
	    
	    
	}

	

