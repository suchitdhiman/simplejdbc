package com.prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.time.LocalDateTime;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ProductRegister extends UrlUsernames {

	private static final String INSERT_PRODUCTS_QUERY = "INSERT INTO PRODUCTS VALUES (?,?,?,?,?)";
	private static final LocalDateTime dateTime = LocalDateTime.now();
	private static final java.sql.Timestamp dateTimeStamp = java.sql.Timestamp.valueOf(dateTime);

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in);
				Connection connection = DriverManager.getConnection(URL, username, password);
				PreparedStatement preparedStatement = connection.prepareStatement(INSERT_PRODUCTS_QUERY);) {
			// taking count of product
			int count = 0;
			if (scanner != null) {
				System.out.println("Please Enter the count of the product to be enter:: ");
				count = scanner.nextInt();
			}

			if (scanner != null && preparedStatement != null) {
				for (int i = 1; i <= count; i++) {
					System.out.println("Please Give the " + i + " product details:: ");
					System.out.println("Enter the Product ID:: ");
					int id = scanner.nextInt();
					scanner.nextLine();

					System.out.println("Enter the Product " + id + " name:: ");
					String name = scanner.nextLine();

					System.out.println("Enter the " + name + " Category:: ");
					String category = scanner.nextLine();

					System.out.println("Enter the " + name + " price:: ");
					double price = scanner.nextDouble();
					scanner.nextLine();

					System.out.println(name + "list Date:: " + dateTimeStamp);

					// set the data
					preparedStatement.setInt(1, id);
					preparedStatement.setString(2, name);
					preparedStatement.setString(3, category);
					preparedStatement.setDouble(4, price);
					preparedStatement.setTimestamp(5, dateTimeStamp);

					// execute the statement

					int result = preparedStatement.executeUpdate();

					if (result == 0) {
						System.out.println(i + "product not be inserted.");
					} else {
						System.out.println(i + " product is inserted.");
					} // else
				} // for
			} // if

		} catch (SQLException se) {
			se.printStackTrace();
		} catch (InputMismatchException ime) {
			ime.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} // catch

	}// main

}// class
