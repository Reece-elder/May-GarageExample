package com.qa.garageTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.qa.garage.Car;
import com.qa.garage.Motorbike;

public class CarTest {
	
	// Testing the FixVehicle()
	Car car1 = new Car("a", true, 1, true, "testColour1");
	Car car2 = new Car("b", false, 2, false, "testColour2");
	
	// Testing 
	
	@Test
	public void fixVehicleTest1() {
		// Arrange
		float result;
		
		// Act 
		result = car1.fixVehicle();
		System.out.println(result);
		
		// Assert
		Assertions.assertEquals(500, result);
	}
	
	@Test
	public void fixVehicleTest2() {
		// Arrange
		float result;
		
		// Act 
		result = car2.fixVehicle();
		System.out.println(result);
		
		// Assert
		Assertions.assertEquals(640, result);
	}
}
