package com.inheritance;

public class Vehicle {
	
	
	public String companyName;
	public String color;
	public int sheats;
	public int numberOfTyres;
	public int maxSpeed;
	
	public Vehicle(String companyName, String color, int sheats, int numberOfTyres, int maxSpeed) {
		super();
		this.companyName = companyName;
		this.color = color;
		this.sheats = sheats;
		this.numberOfTyres = numberOfTyres;
		this.maxSpeed = maxSpeed;
	}
		
	public void displayVehicle() {
		System.out.println("Company Name: "+ companyName);
		System.out.println("color: "+ color);
		System.out.println("Max speed: "+ maxSpeed);
		System.out.println("Sheats: "+ sheats);
		System.out.println("Number of Tyres: "+ numberOfTyres);
	}
	
	

}
