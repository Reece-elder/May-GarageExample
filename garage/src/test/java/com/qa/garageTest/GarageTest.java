package com.qa.garageTest;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.qa.garage.Car;
import com.qa.garage.Garage;
import com.qa.garage.Motorbike;
import com.qa.garage.Vehicle;

public class GarageTest {
	
	// At the top of the class we add any global variables (accessible everywhere in the class)
	Garage testGarage = new Garage(); // object we are testing
	
	// test vehicles
	Car car1 = new Car("a", true, 1, true, "testColour1");
	Car car2 = new Car("b", false, 2, false, "testColour2");
	Motorbike bike1 = new Motorbike("a", true, true, 1, "testColour1");
	Motorbike bike2 = new Motorbike("b", false, false, 2, "testColour2");
	public ArrayList<Vehicle> testList = new ArrayList<>();
	
	
	// Setup
	
	@BeforeEach
	public void setupTest() {
		testGarage.garageList.clear(); // Accessing the arraylist of the garage object
		// Before each test there is car1 and bike1 added to the arraylist
		testGarage.addVehicle(car1);  // index 0
		testGarage.addVehicle(bike1); // index 1
		
		// Setting up our test arrayList
		testList.clear();
		testList.add(car1);
		testList.add(bike1);
		
		System.out.println("Test Setup Finished");
	}
	
	// Testing
	@Test
	public void addVehicleTest() {
		
		// Arrange
		boolean result;
		
		// Act - doing the method we are testing
		result = testGarage.addVehicle(car2);
		
		// Assert
		Assertions.assertTrue(result);
		
	}
	
	@Test
	public void removeVehicleTest() {
		
		// Arrange
		int index = 0; 
		Vehicle result;
		
		// Act - remove the vehicle of index 0
		result = testGarage.removeVehicle(index);
		
		// Assert - Expecting result to look like car1
		System.out.println(result);
		
		// When we are comparing objects, we use assertSame
		Assertions.assertSame(result, car1);
		
	}
	
	@Test
	public void getVehicleTest() {
		// Arrange
		int index = 0;
		Vehicle result;
		
		// Act
		result = testGarage.getVehicle(index);
		
		// Assert
		Assertions.assertEquals(car1, result);
	}
	
	@Test
	public void getAllVehiclesTest() {
		// Arrange
		ArrayList<Vehicle> result; 
		
		// Act
		result = testGarage.getAllVehicles();
		System.out.println(result);
		
		// Assert
		Assertions.assertEquals(testList, result);
	}

}
