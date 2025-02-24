package com.example;

import java.util.Scanner;

public class ClassMain {

	public static void main(String[] args) {
		
		//creating object or instance
		ClassMethod CM2 = new ClassMethod();
		
		//creating reference of object or object  or instance
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Welcome to calculator");
		
		System.out.println("give value one: ");
		
		// taken input from user of type double
		double doubleOne = sc.nextDouble();
		
		System.out.println("give value two: ");
		
		//taken input of type double
		double doubleTwo = sc.nextDouble();
		
		//storing the additon value from method to this sum 
		double sum = CM2.addition(doubleOne, doubleTwo);
		
		// printing the sum value 
		System.out.println("sum is :"+sum);
		
		

	}

}
