package com.bankaccount;

import java.util.Scanner;

public class Customer implements Runnable {
	
	private String name;
	private Account account;
	
	public Customer (Account account, String name) {
		this.account = account;
		this.name = name;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Scanner su = new Scanner(System.in);
		
		synchronized(account) {
		System.out.println(name+", Enter Ammount to WithDrwa: ");
		int amt = su.nextInt();
		
		if(account.isSufficiantBalance(amt)) {
			System.out.println(name);
			account.withdraw(amt);
		}
		else {
			System.out.println("Insufficient Balance");
		}
		
	}
	}
	
	

}
