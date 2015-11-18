package com.lab2.calculator;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import com.lab2.transit.FareCalculator;

@RunWith(Parameterized.class)
public class fareCalculatorTest {

	private double expected;
	private int age;
	private String time;
	private boolean isHoliday;
	private static final double DELTA = 1e-15;
	
	public fareCalculatorTest(double expected, int age, String time, boolean isHoliday)
	{
		this.expected = expected;
		this.age = age;
		this.time = time;
		this.isHoliday = isHoliday;
	}
	
	@Parameters
	public static Collection<Object[]> testParams()
	{ return Arrays.asList(new Object[][]{
			{0.0, 4, "6:00", false},
			{2.5, 6, "20:00", false},
			
			
			{0.0, 0, "15:45", false},
			{0.0, 0, "15:45", true},
			{2.5, 0, "8:30", false},
			{0.0, 0, "8:30", true},
		

			{0.0, 0, "17:45", false},
			{0.0, 0, "17:45", true},
			{0.0, 0, "6:30", false},
			{0.0, 0, "6:30", true},
			
			{0.0, 5, "15:45", false},
			{0.0, 5, "15:45", true},
			{2.5, 5, "8:30", false},
			{0.0, 5, "8:30", true},
			

			{0.0, 5, "17:45", false},
			{0.0, 5, "17:45", true},
			{0.0, 5, "6:30", false},
			{0.0, 5, "6:30", true},
			
			
			{2.5, 56, "15:45", false},
			{2.5, 56, "15:45", true},
			{2.5, 56, "8:30", false},
			{2.5, 56, "8:30", true},
			
			{2.5, 56, "17:45", false},
			{2.5, 56, "17:45", true},
			{2.5, 56, "6:30", false},
			{2.5, 56, "6:30", true},
			
			
			{0.0, 67, "15:45", false},
			{0.0, 67, "15:45", true},
			{2.5, 67, "8:30", false},
			{2.5, 67, "8:30", false},
			
			{0.0, 67, "17:45", false},
			{0.0, 67, "17:45", true},
			{0.0, 67, "6:30", false},
			{0.0, 67, "6:30", true}
			
			
			
	});
	}
	
	@Test
	
	public void calculateFareTest() {
		assertEquals(expected, FareCalculator.calculateFare(age, time, isHoliday), DELTA);
	}

}
