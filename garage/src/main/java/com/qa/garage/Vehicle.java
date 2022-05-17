package com.qa.garage;

public abstract class Vehicle {
	
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
