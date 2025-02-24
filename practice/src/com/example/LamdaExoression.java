package com.example;

import java.util.Scanner;

public class LamdaExoression {
	
	static int fn(int n){
		
		if(n <= 1) {
			
			return n;
		}
		
		return fn(n-1) + fn(n-2);	
		
	}

	public static void main(String[] args) {
		
		for(int i = 0 ; i < 10; i++) {
			System.out.println(fn(i));
		}
		
		// without using recursion
		
		int a= 0;
		int b= 1;
		int num = 10;
		
		for(int i = 1 ; i<10; i++) {
			
			
			System.out.print(a+" ");
			int sum = a + b;
			a = b;
			b = sum;
			
			
		}
		
		
		try {
			Class.forName("MainClass");
		} catch (ClassNotFoundException e) {
		System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Give vlaue x: ");
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		
		try {
		int div = x/y;
		}
		
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.print("finally block worked");
		}
		
		
		
	

	}

}
