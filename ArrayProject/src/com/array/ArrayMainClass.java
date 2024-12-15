package com.array;

public class ArrayMainClass {

	public static void main(String[] args) {
		
	ArrayOperation arrayoperation = new ArrayOperation();
	
	
	int[] array = arrayoperation.arrayDefination(10);
	arrayoperation.insertValueInArray(array);
	
	arrayoperation.insertValueAtIndex(array, 15, 5);
	
	arrayoperation.printArray(array);
	    

	}

}
