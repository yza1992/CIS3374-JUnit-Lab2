package com.lab2.transit;

public class FareCalculator {
	
	public double calculateFare(int age, String time, boolean isHoliday) {
		
		String[] parsedTime = time.split(":");
		
		int hour = Integer.parseInt(parsedTime[0]);
		int minutes = Integer.parseInt(parsedTime[1]);
		
		if(age <= 5 || age >= 65) {
			if(!isHoliday) {
				if(hour < 7 || (hour == 9 && minutes > 0) || hour > 9) {
					return 0.0;
				}
			}
		}
		
		return 2.5;
	}

}
