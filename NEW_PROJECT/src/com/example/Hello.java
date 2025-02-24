package com.example;
import java.util.Scanner;

import com.excercise.*;

 public class Hello {
	 
	 
	 
	 
	public static double add(int a, int b) {
		 System.out.println("This is addision method");
		 double sum = a + b;
		 return sum;
		 
	 }
	
	public double multiple(int a, int b) {
		System.out.println("this is mult function");
		double mul ;
		mul = a*b;
		return mul;
	}
	 

	public static void main(String[] args) {
		
		
		
		Scanner su = new Scanner(System.in);
		
		
		Hello he = new Hello();
		
		
		
		
		 while(true) {
			 System.out.println("Welcome to cal");
			 System.out.println("Press 1 to add");
			 System.out.println("Pess 2 to mul");
			 System.out.println("press 3 to Exit");
			 
			 String val = su.next();
			 
			 switch(val) {
			 case "suchit":
				 System.out.println(add(23, 25));
				 break;

			 case "akshit":
				 System.out.println(he.multiple(12, 13));
				 break;
			 
			 case "kumar":
				 return;
			 
		 }
		
		
	
	
	
	}
	
	
 }
 }
