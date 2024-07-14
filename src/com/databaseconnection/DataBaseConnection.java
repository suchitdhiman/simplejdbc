package com.databaseconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DataBaseConnection {
    public static Statement stmt;
    public static Connection conn;
    public static Scanner scanner = new Scanner(System.in);

    public static void connectionFunction() {
        if (conn == null) {
            try {
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice", "root", "sk8006424");
                stmt = conn.createStatement();
                String createTableSQL = "CREATE TABLE IF NOT EXISTS book ("
                        + "BookId INT(10) PRIMARY KEY, "
                        + "name VARCHAR(255), "
                        + "author_name VARCHAR(255), "
                        + "price DECIMAL(10, 2), "
                        + "isbn VARCHAR(20))";
                stmt.executeUpdate(createTableSQL);
                System.out.println("Table 'book' created successfully or already exists.");
            } catch (SQLException e) {
                System.out.println("Failed to connect to the database or execute the query.");
                e.printStackTrace();
            }
        }
    }

    public static void insertBook() {
        System.out.print("Enter book name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Book Id: ");
        int bookId = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        System.out.print("Enter author name: ");
        String authorName = scanner.nextLine();
        double price = 0.0;
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.print("Enter book price: ");
                price = scanner.nextDouble();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid price.");
                scanner.nextLine(); // Consume the invalid input
            }
        }
        scanner.nextLine(); // Consume the newline character
        System.out.print("Enter ISBN: ");
        String isbn = scanner.nextLine();

        String insertSQL = "INSERT INTO book (BookId, name, author_name, price, isbn) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement statement = conn.prepareStatement(insertSQL)) {
            statement.setInt(1, bookId);
            statement.setString(2, name);
            statement.setString(3, authorName);
            statement.setDouble(4, price);
            statement.setString(5, isbn);

            int rowsAffected = statement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Book data inserted successfully.");
            } else {
                System.out.println("Failed to insert book data.");
            }
        } catch (SQLException e) {
            System.out.println("Failed to connect to the database or execute the query.");
            e.printStackTrace();
        }
    }

    public static void printAllBooks() {
        String query = "SELECT * FROM book";
        try (ResultSet resultSet = stmt.executeQuery(query)) {
            System.out.println("All Books:");
            while (resultSet.next()) {
                int bookId = resultSet.getInt("BookId");
                String name = resultSet.getString("name");
                String authorName = resultSet.getString("author_name");
                double price = resultSet.getDouble("price");
                String isbn = resultSet.getString("isbn");

                System.out.println("Book ID: " + bookId);
                System.out.println("Name: " + name);
                System.out.println("Author: " + authorName);
                System.out.println("Price: " + price);
                System.out.println("ISBN: " + isbn);
                System.out.println();
            }
        } catch (SQLException e) {
            System.out.println("Failed to connect to the database or execute the query.");
            e.printStackTrace();
        }
    }

    public static void getBookById() {
        int bookId = 0;
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.print("Enter book ID: ");
                bookId = scanner.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid book ID.");
                scanner.nextLine(); // Consume the invalid input
            }
        }

        String selectSQL = "SELECT * FROM book WHERE BookId = ?";
        try (PreparedStatement statement = conn.prepareStatement(selectSQL)) {
            statement.setInt(1, bookId);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    String name = resultSet.getString("name");
                    String authorName = resultSet.getString("author_name");
                    double price = resultSet.getDouble("price");
                    String isbn = resultSet.getString("isbn");

                    System.out.println("Book ID: " + bookId);
                    System.out.println("Name: " + name);
                    System.out.println("Author: " + authorName);
                    System.out.println("Price: " + price);
                    System.out.println("ISBN: " + isbn);
                } else {
                    System.out.println("No book found with the given ID.");
                }
            }
        } catch (SQLException e) {
            System.out.println("Failed to connect to the database or execute the query.");
            e.printStackTrace();
        }
    }

    public static void closeConnection() {
        try {
            if (stmt != null) stmt.close();
            if (conn != null) conn.close();
        } catch (SQLException e) {
            System.out.println("Failed to close the database connection.");
            e.printStackTrace();
        }
    }
}
