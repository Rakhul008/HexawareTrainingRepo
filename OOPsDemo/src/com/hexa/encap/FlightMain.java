package com.hexa.encap;

public class FlightMain {

	public static void main(String[] args) {
		Flight flight= new Flight();
		flight.setSource("Chennai");
		flight.setAvailableSeats(2200);
		flight.setDestination("Chennai");
		flight.setType("Economy");
		flight.setNoOfPassenegrs(400);
		
		System.out.println(flight);
	}
}
