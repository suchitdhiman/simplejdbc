package com.program;
/*
 * write a code to reverse a number
 */
import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
			
		Scanner scanner = null;
		int reverse = 0;
		try {
			scanner = new Scanner(System.in);
			System.out.println("Please type your number:");
			int number = scanner.nextInt();
			reverse = 0;
			while(number > 0) {
				reverse = reverse * 10 + (number %10);
				 number = number /10;
			}
			System.out.println("Reverse number is : " + reverse);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
