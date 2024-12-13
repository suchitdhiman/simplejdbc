package com.inheritance;

public class Cycle extends Vehicle {
	
	String type;
	boolean containCarrier;
	

	public Cycle(String type, boolean containCarrier, String companyName, String color, int sheats, int numberOfTyres, int maxSpeed) {
		super(companyName, color, sheats, numberOfTyres, maxSpeed);
		this.type = type;
		this.containCarrier = containCarrier;
		displayCycle();
		
	}
	
	void displayCycle(){
		displayVehicle();
		System.out.println("Cycle Type: "+type);
		System.out.println("Cycle contain Carrer: "+ containCarrier );
		
	
	}

	

}
