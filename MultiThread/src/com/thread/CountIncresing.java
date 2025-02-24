package com.thread;

public class CountIncresing implements Runnable{
	
//	public void countIncreasing() {
//		for(int i = 1; i<=20; i++) {
//			System.out.println("ci"+i);
//		}
//	}

	@Override
	public void run() {
		for(int i = 1; i<=20; i++) {
			System.out.println("ci"+i);
		}
		
	}

}
