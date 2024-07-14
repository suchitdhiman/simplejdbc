package com.mainpackage;

import java.util.Scanner;
import com.databaseconnection.DataBaseConnection;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static int inputException() {
        int choice = 0;
        boolean validInput = false;
        while (!validInput) {
            System.out.print("Enter the option: ");
            String input = sc.nextLine();
            try {
                choice = Integer.parseInt(input);
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }
        return choice;
    }

    public static void displayOptions() {
        System.out.println("\n1. Create table Book.");
        System.out.println("2. Insert Book.");
        System.out.println("3. Retrieve all the Books from the database.");
        System.out.println("4. Retrieve Book from the database by Book ID.");
        System.out.println("5. Close all the connections from the database.");
        System.out.println("6. Exit.");
    }

    public static void run() {
        DataBaseConnection.connectionFunction(); // Ensure the connection is established at the start

        boolean exit = false;
        while (!exit) {
            displayOptions();
            int option = inputException();
            switch (option) {
                case 1:
                    DataBaseConnection.connectionFunction();
                    break;
                case 2:
                    DataBaseConnection.insertBook();
                    break;
                case 3:
                    DataBaseConnection.printAllBooks();
                    break;
                case 4:
                    DataBaseConnection.getBookById();
                    break;
                case 5:
                    DataBaseConnection.closeConnection();
                    break;
                case 6:
                    DataBaseConnection.closeConnection();
                    exit = true;
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        run();
    }
}
