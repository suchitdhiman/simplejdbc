package com.example;

public interface DefaultInterface {
	static String name = "gyugs";
	
	void m1();
	default void m2(int x, int y) {
		System.out.println(x);
		System.out.println(y);
	}
	
	 void m3();
	

}
