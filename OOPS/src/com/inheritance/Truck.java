package com.inheritance;

public class Truck extends Vehicle {
	
	int maxCapacity;

	public Truck(int maxCapcity, String companyName, String color, int sheats, int numberOfTyres, int maxSpeed) {
		super(companyName, color, sheats, numberOfTyres, maxSpeed);
		this.maxCapacity = maxCapcity;
	}

	

}
