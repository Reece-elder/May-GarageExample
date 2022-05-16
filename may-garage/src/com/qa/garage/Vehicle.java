package com.qa.garage;

// Abstract class, can't directly create an object of type Vehicle
public abstract class Vehicle {
	
	// Vehicle Attributes 
	// Condition is going to be either A, B or C
	private String condition; 
	private boolean running;
	
	// Constructor 
	public Vehicle(String condition, boolean running) {
		super();
		this.condition = condition;
		this.running = running;
	}
	
	// Abstract method 
	public abstract float fixVehicle();
	
	// Getters and Setters
	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public boolean isRunning() {
		return running;
	}

	public void setRunning(boolean running) {
		this.running = running;
	}
	
	
	



}
