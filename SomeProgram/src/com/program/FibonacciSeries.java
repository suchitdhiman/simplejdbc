package com.program;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
	
		Scanner scanner = null;
		int length = 0, fibocani = 1, count = 1, temp = 1;
			
		try {
	    	scanner = new Scanner(System.in);
			System.out.println("Length of the Fibonaci: ");
			length = scanner.nextInt();
		
			if(length > 1 && count >= 1) {
				
				while(count <= length) {
					System.out.print(fibocani+" ");
					temp =  fibocani-temp;
					fibocani = temp + fibocani;
					
					count++;
					
				}//while
			}//if
			
		}//try
		catch(Exception e) {
			e.printStackTrace();
		}//catch
		finally {
			if(scanner !=null) {
				scanner.close();
			}//if
		}//finally

	}//main

}//class
