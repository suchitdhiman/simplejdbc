package com.inheritance;

public class Bike extends Vehicle {
	public String type;
	public boolean isContainStand;
	
	public Bike(String companyName, String color, int sheats, int numberOfTyres, int maxSpeed, String type,
			boolean isContainStand) {
		super(companyName, color, sheats, numberOfTyres, maxSpeed);
		this.type = type;
		this.isContainStand = isContainStand;
		displayBike();
	}
	
	public void displayBike(){
		displayVehicle();
		System.out.println("Type of Bike: "+ type);
		System.out.println("Bike Conatain stand: "+isContainStand);
		
	}
	
	


}
