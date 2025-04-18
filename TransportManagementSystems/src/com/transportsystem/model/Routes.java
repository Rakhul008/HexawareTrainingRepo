package com.transportsystem.model;

public class Routes {
	private int routeId;
	private String startDestination;
	private String endDestination;
	private int distance;
	
	
	public int getRouteId() {
		return routeId;
	}
	public void setRouteId(int routeId) {
		this.routeId = routeId;
	}
	public String getStartDestination() {
		return startDestination;
	}
	public void setStartDestination(String startDestination) {
		this.startDestination = startDestination;
	}
	public String getEndDestination() {
		return endDestination;
	}
	public void setEndDestination(String endDestination) {
		this.endDestination = endDestination;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	public Routes(int routeId, String startDestination, String endDestination, int distance) {
		super();
		this.routeId = routeId;
		this.startDestination = startDestination;
		this.endDestination = endDestination;
		this.distance = distance;
	}
	@Override
	public String toString() {
		return "Routes [routeId=" + routeId + ", startDestination=" + startDestination + ", endDestination="
				+ endDestination + ", distance=" + distance + "]";
	}
	
}
