package com.example;

class B {

	public static String bName = "Suchit Kumar";

}

public class MainClass {
	static boolean milGyiKya;

	public static void main(String[] args) throws ClassNotFoundException {

		Class.forName("com.example.B");
		milGyiKya = true;

		if (milGyiKya == true) {
			System.out.println("ha mil gyi");
		} else {
			System.out.println("Na mili ni");
		}

		// B b = new B();
		System.out.println(B.bName);

	}

}
