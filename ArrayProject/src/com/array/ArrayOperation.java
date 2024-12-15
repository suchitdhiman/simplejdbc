package com.array;

public class ArrayOperation extends ArrayDefination {
	
	void insertValueAtIndex(int[] array, int value, int index){
		int temp = 0;
		for(int i = index ; i<array.length; i++) {	
			temp = array[i];
			array[i] = value;
			value = temp;
		}
	}

}
