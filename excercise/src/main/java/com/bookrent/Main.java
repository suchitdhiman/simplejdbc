package com.bookrent;

import java.util.Scanner;

public class Main {
	
	private static void runApplication(String url, String username, String password) {
		//Ensure the connection is established at the start
		try {
		
		DataBaseConnection.connectionFunction(url, username,password);
		
	}catch(Exception e) {
		e.printStackTrace();
	}
	}
	
	

	public static void main(String[] args) {
		Scanner scanner = null;
		String url = "jdbc:mysql://localhost:3306/practice";
		String username;
		String password;
		try{
			scanner = new Scanner(System.in);
			username = "root";
			password = "sk8006424";
			runApplication(url, username, password);
						
		}catch(Exception e){
			e.printStackTrace();
		}
		finally {
			if(scanner != null) {
				scanner.close();
			}
		}
		
		

	}

}
