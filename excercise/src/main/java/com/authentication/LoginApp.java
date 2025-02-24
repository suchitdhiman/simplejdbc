package com.authentication;

import jdbc.excercise.DatabaseUrl;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class LoginApp extends DatabaseUrl {

	public static void main(String[] args) {
	
		try( Scanner scanner = new Scanner(System.in);
			Connection connection = DriverManager.getConnection(url, username, password);
			Statement statement = connection.createStatement();){
			
			//read inputs
			String user = null, pass = null;
			if (scanner != null) {
				System.out.println("Enter username: ");
				user = scanner.nextLine();
				System.out.println("Enter password: ");
				pass = scanner.nextLine();
			}
			
			//convert the input as per SQL query
			user = "'"+user+"'";
			pass = "'"+pass+"'";
			
			//prepare query
			//SELECT COUNT(*) FROM USER WHERE username = 'username' & pass = 'pass';
			String query = "SELECT COUNT(*) FROM PERSON WHERE USERNAME="+user+"AND PASSWORD="+pass;
			System.out.println(query);
			if(statement != null)
			try(ResultSet resultSet = statement.executeQuery(query)){
				if(resultSet!=null)
				resultSet.next();
				int count = resultSet.getInt(1);
				if(count==0) {
					System.out.println("invalid username or password");
					
				}
				else {
					System.out.println("valid username and password");
				}
				}
			}
			catch(SQLException se) {
				se.printStackTrace();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
	}

}
