package com.bankaccount;

public class ThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Account a1 = new Account(1000);
		
		Customer c1 = new Customer(a1, "Suchit"), 
				 c2 = new Customer(a1, "akshit");

		Thread t1 = new Thread (c1);
		Thread t2 = new Thread(c2);
		synchronized (t2) {
		t1.start();
		t2.start();
		}
		

	}

}
