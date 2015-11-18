package com.lab2.transit;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class FareCalculatorTest {

	private static final double DELTA = 1e-15;

	private double expected;
	private int age;
	private String time;
	private boolean isHoliday;

	public FareCalculatorTest(double expected, int age, String time, boolean isHoliday) {	//This is the constructor
		this.expected = expected;
		this.age = age;
		this.time = time;
		this.isHoliday = isHoliday;
	}

	@Parameters
	public static Collection<Object[]> testParams() {
		return Arrays.asList(new Object[][] {
				{0.0, 4, "6:00", false},
				{2.5, 6, "20:00", false}
				{ 
		});
	}
	
	@Test
	public void calculateFareTest() {
		assertEquals(expected, FareCalculator.calculateFare(age, time, isHoliday), DELTA);
	}

}
