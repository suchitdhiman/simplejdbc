package com.prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PrepareStatement extends UrlUsernames{
	
	private static final String STUDENT_INSERT_QUERY = "INSERT INTO STUDENT VALUES (?,?,?,?,?)";

	public static void main(String[] args) {
		
		try (
				Scanner scanner = new Scanner(System.in);
				Connection connection = DriverManager.getConnection(URL, username, password);
				PreparedStatement preparedStatement = connection.prepareStatement(STUDENT_INSERT_QUERY);
			){
			
			int count = 0;
			//taking count from the user 
			if(scanner != null) {
				System.out.println("Please give the student count:: ");
				count = scanner.nextInt();
			}
			if(preparedStatement!=null && scanner!=null) {
			for(int i = 1; i<=count; i++) {
				//reading each student values
				System.out.println("Enter "+i+" student details:: ");
				System.out.println("Enter student number:: ");
				int studentNumber = scanner.nextInt();
				scanner.nextLine();
				
				//reading name 
				System.out.println("Please Enter the name of the "+studentNumber+" student:: ");
				String name = scanner.nextLine();
				
				//reading the class
				System.out.println("Please Enter the class of the "+name+" student:: ");
				String sClass = scanner.nextLine();
				
				//reading average
				System.out.println("Please Enter the average of the "+name+" student:: ");
				float average = scanner.nextFloat();
				scanner.nextLine();
				
				//address of the class
				System.out.print("Enter the address of the "+name+" student:: ");
				String address = scanner.nextLine();
				
				//set each student details 
				preparedStatement.setInt(1, studentNumber);
				preparedStatement.setString(2, name);
				preparedStatement.setString(3, sClass);
				preparedStatement.setFloat(4, average);
				preparedStatement.setString(5, address);
				
				//execute the query
				int result = preparedStatement.executeUpdate();
				
				//process the result
				if(result == 0 ) {
					System.out.println(i+" student data is not inserted.");
				}else {
					System.out.println(i+" student data is inserted.");
				}//else
				
			}//for
			}//if
			
			
			
		}catch(SQLException se) {
			se.printStackTrace();
		}catch(InputMismatchException ime) {
			ime.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}//catch
		

	}//main

}//class
