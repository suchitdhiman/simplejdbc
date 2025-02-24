package com.students;

import java.util.Scanner;

public class StudentManagement {
	
	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	  
	Student studentOne = new Student();
	
	String name = scanner.nextLine();
	System.out.println(name);
	
	String nameTwo = scanner.next();
	scanner.nextLine();
	System.out.println(nameTwo);
	
	int age = scanner.nextInt();
	scanner.nextLine();
	System.out.println(age);
	
	String nameThree = scanner.nextLine();
	System.out.println(nameThree);
	
	
	
	
		}
}
