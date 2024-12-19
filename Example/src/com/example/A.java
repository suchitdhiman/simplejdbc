package com.example;

public class A {
	static {
		double interest = 12.5;
	}
	
	String name;
	int phone;
	String address;
	private String education;
	
	public A(){
		
	}
	
	
   public A(String name, int phone,String address, String education ) {
		this.name = name;
		this.phone = phone;
		this.address= address;
		this.education = education;
	}
	
	public A(String name, int phone){
		this.name = name;
		this.phone = phone;
	}
	
	public A(String address, String education){
		this.address = address;
		this.education = education;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}
	
	

}
