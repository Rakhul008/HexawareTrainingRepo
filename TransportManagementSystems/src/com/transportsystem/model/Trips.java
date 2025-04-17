package com.transportsystem.model;

import java.time.LocalDate;

public class Trips {
	private int tripId;
	private int vehicleId;
	private int routeId;
	private LocalDate departureTime;
	private LocalDate arrivalTime;
	private String status;
	private String tripType;

	public Trips(int tripId, int vehicleId, int routeId, LocalDate departureTime, LocalDate arrivalTime, String status,
			String tripType) {
		super();
		this.tripId = tripId;
		this.vehicleId = vehicleId;
		this.routeId = routeId;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.status = status;
		this.tripType = tripType;
	}

	public int getTripId() {
		return tripId;
	}

	public void setTripId(int tripId) {
		this.tripId = tripId;
	}

	public int getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	public int getRouteId() {
		return routeId;
	}

	public void setRouteId(int routeId) {
		this.routeId = routeId;
	}

	public LocalDate getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(LocalDate departureTime) {
		this.departureTime = departureTime;
	}

	public LocalDate getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(LocalDate arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTripType() {
		return tripType;
	}

	public void setTripType(String tripType) {
		this.tripType = tripType;
	}

	@Override
	public String toString() {
		return "Trips [tripId=" + tripId + ", vehicleId=" + vehicleId + ", routeId=" + routeId + ", departureTime="
				+ departureTime + ", arrivalTime=" + arrivalTime + ", status=" + status + ", tripType=" + tripType
				+ "]";
	}

	public void scheduleTrip() {

	}

	public void cancelTrip() {

	}

	public void bookTrip() {

	}

}
