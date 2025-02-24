package com.oops;

public class Account {
	String name ;
	int age;
	String bankName;
	
	
	
	public Account(String name, int age){
		this.name  = name;
		this.age = age;
		
	}
	
	{
		bankName = "SBI";
		System.out.println("This is BankName: "+bankName);
	}
	
	static {
		System.out.println("this is static block");
	}
	
  
	public static void main(String args[]) {
		System.out.println("this is main");
		Account mcc = new Account("mcc", 23);
		Account suchit = new Account("suchit", 24);
		
		System.out.println("this is mcc:"+mcc.name);
		System.out.println("this is mcc"+mcc.age);
		System.out.println("mcc bank Name is: "+mcc.bankName);
		System.out.println("this is suchit: "+suchit.name);
		System.out.println("this is suchit: "+suchit.age);
		System.out.println("suchit bank Name is: "+suchit.bankName);
		
	}

}

