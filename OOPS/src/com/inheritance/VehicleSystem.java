package com.inheritance;

public class VehicleSystem {
	
	public static void main(String[] args) {
	//	Vehicle veh = new Vehicle("Toyota","White",2,4,260);
		Car car = new Car("Toyota", "White", 260, 4, 4, "Normal", 05);
		Bike bike = new Bike("Hero", "Black", 2, 2, 120, "Normal", true);
		Cycle cycle = new Cycle("classic", true, "Atlas", "White", 2, 2, 40);
	}

}
