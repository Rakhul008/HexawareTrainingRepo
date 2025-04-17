package com.hexa.abs;

public class SmartPhone extends Mobile {

	public SmartPhone(String model, String brand, double price) {
		super(model, brand, price);
	}

	void showFeatures() {
		System.out.println("Great Camera with Well Processor");
	}

	String[] showAccessories() {
		return new String[] {"Temper-Glass","Charger"};
	}

}
