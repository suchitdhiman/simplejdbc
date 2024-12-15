package com.array;

public class ArraySecond {

	public static void main(String[] args) {
		
		int arr[] = {12, 13, 14, 15, 16};
		
		int firstValue = arr[0];
		int lastValue = arr[arr.length-1];
		int temp = lastValue;
		
		lastValue = firstValue;
		firstValue = temp;
		
		arr[0] = temp;
		arr[arr.length-1] = lastValue;
		for(int i = 0; i< arr.length; i++) {
			System.out.println(arr[i]);
		}	

	}

}
