package com.thread;

public class MainClass {
	
	public static void main(String[] args) {
	
	CountIncresing ci = new CountIncresing();
	Thread threadOne = new Thread(ci);
	
	CountDecreasing cd = new CountDecreasing();
	Thread threadTwo = new Thread(cd);
	
	threadOne.start();
	threadTwo.start();
	
	System.out.println("main class");
	
	
	}
}
