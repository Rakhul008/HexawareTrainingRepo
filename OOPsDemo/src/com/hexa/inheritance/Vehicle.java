package com.hexa.inheritance;

public class Vehicle {

	String model;
	int price;

	public Vehicle(String model, int price) {
		super();
		this.model = model;
		this.price = price;
	}

	void printDetails() {
		System.out.println("Model :" + model);
		System.out.println("Price: " + price);

	}

}
