package com.banking;



public class BankingSystem {

	public static void main(String[] args) {
		
		Bank saving = new SavingAccount("Suchit Kumar", 5000);
		Bank current = new CurrentAccount("pachi", 10000);
		
		
		
		saving.displayBalance();
		saving.withdrwal(1500);
		saving.displayBalance();
		
		//current
		current.displayBalance();
		current.withdrwal(11000);
		current.displayBalance();
		
		
		
		
		
		
		
		

	}

}
