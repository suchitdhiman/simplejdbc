package com.program;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		try(
		Scanner scanner = new Scanner(System.in)){
			System.out.println("Give a number to check for perfect Number: ");
			int number = scanner.nextInt();
			int sum = 0;
			
			for(int i=1; i<number; i++) {
				if(number % i==0) {
					sum = sum + i;
				}
			}
			//check for the sum equal to number 
			if(sum == number) {
				System.out.println(number+" is perfect number.");
			}else {
				System.out.println(number+" is not perfect number");
			}
		 if(scanner != null) {
			 scanner.close();
		 }
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		

	}

}
