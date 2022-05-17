package com.qa.main;

import com.qa.garage.Car;
import com.qa.garage.Garage;
import com.qa.garage.Motorbike;

public class Runner {

	// Replicating what a user would do when using this app 
	public static void main(String[] args) {
		// Create all of our objects 
		Garage kwikFit = new Garage(); // Making our garage object
		
		// Will my garage be able to store car1 and bike1? - Car == Vehicle
		// Car is inheriting Vehicle - Polymorphism 
		Car car1 = new Car("b", true, 5, true, "teal");
		Car car2 = new Car("a", false, 4, true, "teal");
		Car car3 = new Car("c", true, 4, false, "teal");
		Motorbike bike1 = new Motorbike("c", false, true, 3, "silver");
		
		// Adding my vehicles 
		kwikFit.addVehicle(bike1);
		kwikFit.addVehicle(car1);
		kwikFit.addVehicle(car2);
		kwikFit.addVehicle(car3);
		
		// Fixing all vehicles by type
		kwikFit.fixVehicleByType("Car");
		
		// Vehicle fix method
		System.out.println(kwikFit.garageFixVehicle(0));
		System.out.println(kwikFit.garageFixVehicle(1));
		
		// Printing out all of the vehicles in my garage
		System.out.println(kwikFit.getAllVehicles());

	}

}
