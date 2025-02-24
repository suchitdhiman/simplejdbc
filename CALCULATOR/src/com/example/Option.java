package com.example;

import java.util.Scanner;

public class Option {

	// addition function
	int addition(int a, int b) {
		return a + b;
	}

	// subtraction function
	int subtraction(int a, int b) {
		return a - b;
	}

	double multiple(double a, double b) {
		return a * b;
	}

	double divide(double a, double b) {
		return a / b;
	}

	public static void main(String[] args) {

		// option class object
		Option aa = new Option();
		Option bb = new Option();

		// scanner class object
		Scanner s = new Scanner(System.in);
		System.out.println("welcome to calculator");

		while (true) {
			System.out.print("Please give value: ");
			int a = s.nextInt();
			System.out.println("Please choice operation");
			System.out.println("1 for addition.");
			System.out.println("2 for subtraction");
			System.out.println("3 for multiple");
			System.out.println("4 for didvide");
			System.out.println("5 for exitd");

			int input = s.nextInt();
			switch (input) {
			case 1:
				System.out.println("please give second value: ");
				int b = s.nextInt();
				System.out.println(aa.addition(a, b));
				break;

			}

		}

	}

}
