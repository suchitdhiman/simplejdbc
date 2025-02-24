package com.example;

public class StringExample implements DefaultInterface {
	static String name, secondName; 
	
	@Override
	public void m1() {
		System.out.println("m1 method");
		
	}
	@Override
	public void m3() {
		System.out.println("kjskdf");
		System.out.println("hjbkh");
		
	}
	
	
	
	

	
	public static void main(String[] args) {
		
		StringExample se = new StringExample();
		name = "suchit";
		secondName = "ruchit";
		
		System.out.println(name);
		System.out.println(secondName);
		se.m1();
		se.m2(12,23);
		se.m3();
	}
}
