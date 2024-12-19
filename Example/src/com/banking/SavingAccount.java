package com.banking;

public class SavingAccount extends Bank{
	
	private double interestRate = 0.03;
	
	public SavingAccount(String accountHolderName, double balance) {
		super(accountHolderName, balance);
	}

	@Override
	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println(amount+": Succesfully Deposisted in your account.");
		
	}

	@Override
	public void withdrwal(double amount) {
		 if (balance - amount >= 0) {
	            balance = balance - amount;
	            System.out.println(amount + " withdrawal from Savings Account.");
	        } else {
	            System.out.println("Insufficient balance!");
	        }
		
		
	}
	
	// Interest method
	
	public void applyInterest() {
		balance = balance * interestRate;
	}

}
