package com.qa.garage;

import java.util.ArrayList;

// Where our business logic is, we will be creating an object of type Garage
public class Garage {
	
	// Create an arraylist to store Data 
	public ArrayList<Vehicle> garageList = new ArrayList<>();
	
	// Add Vehicle - Takes in data of type Vehicle, and we call it vehicle
	public boolean addVehicle(Vehicle vehicle) {
		garageList.add(vehicle); // Saves the passed in data (vehicle) and puts in arrayList
		return true;
	}
	
	// Remove Vehicle - Take in index as an int to remove from arraylist
	public Vehicle removeVehicle(int index) {
		return garageList.remove(index); // returns the object (Vehicle) we are removing
	}
	
	// Get Vehicle - Take in index as an int, to return this vehicle
	public Vehicle getVehicle(int index) {
		return garageList.get(index);
	}
	
	// Fix Vehicle - Run the method we created in our objects, take in index as int to fix that vehicle
	public float garageFixVehicle(int index) {
		Vehicle vehicleToFix = getVehicle(index);
		return vehicleToFix.fixVehicle(); // Running the method created in car / motorbike
	}

	// Get All Vehicles - Return all of the vehicles in our arrayList
	public ArrayList<Vehicle> getAllVehicles() {
		return garageList; // garageList == ArrayList<Vehicle>
	}
	
	// Stretch goal - Fix All Vehicles by Type
	


}
