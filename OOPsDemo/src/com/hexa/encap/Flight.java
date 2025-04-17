package com.hexa.encap;

public class Flight {
		private int noOfPassenegrs;
		private String type;
		private String FlightName;
		private int availableSeats;
		private String Source;
		private String Destination;
		public  Flight() {
			super();
		}
	
		public Flight(int noOfPassenegrs, String type, String flightName, int availableSeats, String source,
				String destination) {
			super();
			this.noOfPassenegrs = noOfPassenegrs;
			this.type = type;
			FlightName = flightName;
			this.availableSeats = availableSeats;
			Source = source;
			Destination = destination;
		}
		public int getNoOfPassenegrs() {
			return noOfPassenegrs;
		}
		public void setNoOfPassenegrs(int noOfPassenegrs) {
			this.noOfPassenegrs = noOfPassenegrs;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public String getFlightName() {
			return FlightName;
		}
		public void setFlightName(String flightName) {
			FlightName = flightName;
		}
		public int getAvailableSeats() {
			return availableSeats;
		}
		public void setAvailableSeats(int availableSeats) {
			this.availableSeats = availableSeats;
		}
		public String getSource() {
			return Source;
		}
		public void setSource(String source) {
			Source = source;
		}
		public String getDestination() {
			return Destination;
		}
		public void setDestination(String destination) {
			Destination = destination;
		}
		@Override
		public String toString() {
			return "Flight [noOfPassenegrs=" + noOfPassenegrs + ", type=" + type + ", FlightName=" + FlightName
					+ ", availableSeats=" + availableSeats + ", Source=" + Source + ", Destination=" + Destination
					+ "]";
		}	
}


