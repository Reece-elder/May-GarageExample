package com.qa.garage;

public class Motorbike extends Vehicle  {
	
	// Specific attributes
	private boolean sideCar;
	private int numberWheels;
	private String colour;
	
	// Constructor
	public Motorbike(String condition, boolean running, boolean sideCar, int numberWheels, String colour) {
		super(condition, running);
		this.sideCar = sideCar;
		this.numberWheels = numberWheels;
		this.colour = colour;
	}

	@Override
	public float fixVehicle() {
		float fixCost = 90f;
		
		// Could also be written as if(electric)
		if(sideCar == true) {
			fixCost += 400;
		} else {
			fixCost += 20;
		}
		
		// times the total by number of doors and return result
		fixCost = fixCost * numberWheels;
		
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
	public boolean isSideCar() {
		return sideCar;
	}

	public void setSideCar(boolean sideCar) {
		this.sideCar = sideCar;
	}

	public int getNumberWheels() {
		return numberWheels;
	}

	public void setNumberWheels(int numberWheels) {
		this.numberWheels = numberWheels;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	// What is returned when we syso our object
	@Override
	public String toString() {
		return "Motorbike [sideCar= " + sideCar + ", numberWheels= " + numberWheels + ", colour= " + colour
				+ ", condition= " + getCondition() + ", running= " + isRunning() + "]";
	}
	
	
	
	
	
	
	
	

}
