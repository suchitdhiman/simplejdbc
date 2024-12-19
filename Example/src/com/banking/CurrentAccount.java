package com.banking;

public class CurrentAccount extends Bank {
	
	 public CurrentAccount(String accountHolderName, double balance) {
		super(accountHolderName, balance);
		
	}

	private double overdraftLimit = 5000; // Overdraft limit of $5000

	@Override
	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println(amount+" : is deposisted succesfully.");
		
	}

	@Override
	public void withdrwal(double amount) {
		if(balance-amount >= -overdraftLimit) {
			balance = balance - amount;
			System.out.println(amount+" : is withdrawal succesfully.");
		}
		else {
			System.out.println("Balance is unsuficient");
		}
		
		
	}

}
