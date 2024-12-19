package com.example;

public class B extends A{
	
	public B () {
		super();
	}
	

	public int factorial(int value){
		
		if(value == 0) {
			return 1;
		}
		
		return (factorial(value) * factorial(value-1)); 
	}
}
