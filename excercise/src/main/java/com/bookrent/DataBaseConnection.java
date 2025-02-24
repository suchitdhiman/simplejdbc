package com.bookrent;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class DataBaseConnection {
	public static Statement statement;
	public static Connection connection;
	
	
	public static void connectionFunction(String url, String username, String password) {
		if(connection == null )
		try {
			connection = DriverManager.getConnection(url,username,password);
			statement = connection.createStatement();
			String createTableSQLQuery = "CREATE TABLE IF NOT EXISTS BOOKLIST("
					+"BookId INT(10) PRIMARY KEY, "
                    + "name VARCHAR(255), "
                    + "author_name VARCHAR(255), "
                    + "price DECIMAL(10, 2), "
                    + "isbn VARCHAR(20))" ;
			
			statement.executeUpdate(createTableSQLQuery);
			System.out.println("Table 'Book' created successfully or already exists.");
		}catch(SQLException se) {
			System.out.println("Failed to connect to the database or execute the query.");
			se.printStackTrace();
		}
	}
}
