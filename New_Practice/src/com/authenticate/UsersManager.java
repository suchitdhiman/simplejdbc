package com.authenticate;

import java.util.ArrayList;
import java.util.Scanner;

public class UsersManager {
	
	private static Scanner su = new Scanner(System.in);
	
	private static User newUser;
	
	static ArrayList<User> users = new ArrayList<User>();
	
	User suchit = new User("suchit", "test123");
	
	public UsersManager() {
		users.add(suchit);
	}
	
	public void checkVerifyUP(String username, String password) {
	boolean found = false;
	
	for(User user: users) {
		if(user.getUsername().equals(username) && user.getPassword().equals(password)) {
			found = true;
			break;
		}
	}
	if(found == true) {
		System.out.println("Welcome to the website");
	}
	else {
		System.out.println("Please don't try again username and password you filled is wrong ");
	}
	
	}
	
	
	
	public static void main(String[] args) {
		
		System.out.println("* Welcome to My Company *");
		boolean isRegisterd = false;
		
		
		System.out.println("Do you have username and Password?, If Yes Type \"YES\" If No \"NO\"!");
		String userInput = su.next();
		if(userInput.equals("YES") || userInput.equals("NO")) {
			while(true) {
			if(userInput.equals("YES"))
			isRegisterd = true;
		
		if (isRegisterd) {
		System.out.println("please login to continue ");
		System.out.println(" ");
		System.out.println("Plese give the username: ");
		String username = su.next();
		System.out.println("please give the password: ");
		String password = su.next();
		UsersManager um = new UsersManager();
		um.checkVerifyUP(username, password);
		return;
	}
		
		else {
			System.out.println("Please Register First: ");
			System.out.print("What will be your UserName: ");
			String username = su.next();
			System.out.println("What will be yout password: ");
			String password = su.next();
		    System.out.println("Thanks to Registeration");
		    newUser = new User(username, password);
		    users.add(newUser);
		    System.out.print("Do you want to Login?, Type \"YES\" or \"NO\" to EXIT");
		    String forLoginInput = su.next();
		    if(forLoginInput.equals("YES")) {
		    	isRegisterd = true;
		    }
		    else if(forLoginInput.equals("NO")){
		    	break;
		    }
		   		}
		}
		}
		System.out.println("please get lost");
	}
}

	


	
