package com.inheritance;

public class Car extends Vehicle {
	
	public String type;
	public int numberOfDoor;
	
	public Car(String companyName, String color, int sheats, int numberOfTyres, int maxSpeed, String type,
			int numberOfDoor) {
		super(companyName, color, sheats, numberOfTyres, maxSpeed);
		this.type = type;
		this.numberOfDoor = numberOfDoor;
		displayCar();
	}
	
	void displayCar() {
		displayVehicle();
		System.out.println("Type of Car: "+ type);
		System.out.println("Number of Door: "+ numberOfDoor);
		
	}
	
	
	
	
	
	

	
	
	
	
	

}
