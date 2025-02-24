package com.scanner;

import java.util.Scanner;

public class NewScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please Scan the data: ");
		int id = scanner.nextInt();
		scanner.nextLine();
		String firstnName = scanner.nextLine();
		String lastName = scanner.nextLine();
		int age = scanner.nextInt();
		
		System.out.println("Your id is: "+id);
		System.out.println("given Name is:"+firstnName);
		System.out.println("givent last name is:"+lastName);
		System.out.println("given age is: "+age);
		

	}

}
