package com.bankaccount;

public class Account {
	private int bal;
	public Account(int bal) {
		this.bal = bal;
	}
	public boolean isSufficiantBalance( int w) {
		if(bal>w)
			return true;
		else
			return false;
	}
	
	public void withdraw(int amt) {
		bal = bal-amt;
		System.out.println("withdrawl money is: "+ amt);
		System.out.println("Your current balance is: "+ bal);
	}

}
