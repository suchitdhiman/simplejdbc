package com.array;

import java.util.Scanner;

public class ArrayDefination {
	
	Scanner scanner = new Scanner(System.in);
	
	public int[] arrayDefination(int length) {
		int[] array = new int[length];
		return array;
	}
	
	public void insertValueInArray(int[] array) {
		for(int i = 0; i<array.length; i++) {
			System.out.print("Please give Array "+i+"th value: ");
			array[i] = scanner.nextInt();
		}
	}
	
	void printArray(int[] array){
		for(int i = 0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		
	}

}
