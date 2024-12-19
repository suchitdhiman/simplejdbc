package com.example;

public class MainClass extends C{
	
	public void sum(int x) {
		System.out.println(x);
	}

	public static void main(String[] args) {
		double y = 10.0;

		B b = new B();
		
		
	
//		System.out.println(b.factorial(5));
		
		//C c = new C();
//		c.print(5);
//		c.print();
		
		A ruchit = new A("ksjdlkf", 87234, "saharanpur", "B.Tech");
		
		A suchit = new A("Suchit", 12345678);
		A kk = new A("kk", 768632);
		
		System.out.println(suchit.name);
		System.out.println(kk.phone+" "+ suchit.phone);
		System.out.println(kk.getEducation());
		kk.setEducation("B.tech");
		System.out.println(kk.getEducation());
		
		

	}

}
