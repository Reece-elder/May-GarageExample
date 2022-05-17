package com.qa.garage;

public class Car extends Vehicle {
	
	private int doors;
	private boolean electric;
	private String colour;
	
	// Constructor
	public Car(String condition, boolean running, int doors, boolean electric, String colour) {
		super(condition, running);
		this.doors = doors;
		this.electric = electric;
		this.colour = colour;
	}

	@Override
	public float fixVehicle() {
		float fixCost = 200f;
		
		// Could also be written as if(electric)
		if(electric == true) {
			fixCost += 400;
		} else {
			fixCost += 20;
		}
		
		// times the total by number of doors and return result
		fixCost = fixCost * doors;
		
		if(getCondition() == "a") {
			fixCost -= 100;
		} else if(getCondition() == "b") {
			fixCost += 200;
		} else if(getCondition() == "c") {
			fixCost += 500;
		}
		
		return fixCost;
	}

	// Getters and Setters
	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public boolean isElectric() {
		return electric;
	}

	public void setElectric(boolean electric) {
		this.electric = electric;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	@Override
	public String toString() {
		return "Car [doors= " + doors + ", electric= " + electric + ", colour= " + colour + ", condition= "
				+ getCondition() + ", running= " + isRunning() + "]";
	} 
	
	

}
