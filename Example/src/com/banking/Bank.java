package com.banking;

public abstract class Bank {
	
	protected String accountHolderName;
	protected double balance;
	
	public Bank(String accountHolderName, double balance) {
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}
	
	//abstract method
	public abstract void deposit(double amount);
	public abstract void withdrwal(double amount);
	
	//non abstract method
	
	public void displayBalance() {
		System.out.println("Account Holder Name: "+ accountHolderName);
		System.out.println("Balance: "+ balance);
	}

}
