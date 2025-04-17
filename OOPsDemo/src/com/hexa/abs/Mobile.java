package com.hexa.abs;

public abstract class Mobile {
	String model;
	String brand;
	double price;

	public Mobile(String model, String brand, double price) {
		super();
		this.model = model;
		this.brand = brand;
		this.price = price;
	}
	
	void printDetails() {
		System.out.println("model " + model);
		System.out.println("brand " + brand);
		System.out.println("price " + price);
	}

	  abstract void showFeatures() ;
	

	abstract String[] showAccessories() ;
	
}
