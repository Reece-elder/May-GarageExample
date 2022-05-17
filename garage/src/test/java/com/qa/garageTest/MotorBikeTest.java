package com.qa.garageTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.qa.garage.Motorbike;

public class MotorBikeTest {

	Motorbike bike1 = new Motorbike("a", true, true, 1, "testColour1");
	Motorbike bike2 = new Motorbike("b", false, false, 2, "testColour2");
	Motorbike bike3 = new Motorbike("c", false, false, 3, "testColour3");

	@BeforeEach
	public void setup() {
		System.out.println("Run before each and every @Test");
	}

	@Test
	public void fixVehicle1() {
		// Arrange
		float result;

		// Act
		result = bike1.fixVehicle();
		System.out.println(result);

		// Assert
		Assertions.assertEquals(390, result);

	}
	
	@Test
	public void fixVehicle2() {
		// Arrange
		float result;

		// Act
		result = bike2.fixVehicle();
		System.out.println(result);

		// Assert
		Assertions.assertEquals(420, result);

	}
	
	@Test
	public void fixVehicle3() {
		// Arrange
		float result;

		// Act
		result = bike3.fixVehicle();
		System.out.println(result);

		// Assert
		Assertions.assertEquals(830, result);

	}

}
