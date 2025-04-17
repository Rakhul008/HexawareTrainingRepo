package com.hexa.overriding;

public class Scooty extends TwoWheeler {

	public Scooty(String model, String brand, double price) {
		super(model, brand, price);
	}

	void printDetails() {
		System.out.println("TVS" + "Pept" + 20000);
	}

	void getMileage() {
		System.out.println("Good");
	}

	String[] showAccessories() {
		String accessories[] = { "Gloves", "Helmet", "Rear-View Mirror" };
		return accessories;
	}
}
