package com.example;

public class StaticBlockMainClass {
	
	static String name;
	static {
		System.out.println("static block initialized..");
	    String name = "suchit";
	}
	
	String firstName;
	
	public static void main(String[] args) {
		
		System.out.println("this is Main");
		
		StaticBlockMainClass sbmc = new StaticBlockMainClass();
		System.out.println(sbmc.firstName);
		System.out.println(name);
		
		
		
	}

}
