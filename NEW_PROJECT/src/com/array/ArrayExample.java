package com.array;

import java.time.LocalDateTime;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int packet[]= {12, 13, 15, 17, 19};
		
		int [] pac = new int[10];
		
		Thread tA = new Thread(new A());
		
		Thread tB = new Thread(new B());
		
		tA.start();
		LocalDateTime ldt = LocalDateTime.now();
		
		System.out.println(ldt);
		
		System.out.println("After a");
		
		tB.start();
		
		

	}

}
