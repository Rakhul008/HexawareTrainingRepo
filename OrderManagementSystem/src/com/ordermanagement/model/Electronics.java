package com.ordermanagement.model;

public class Electronics extends Products {
	private String brand;
	private int warrantyPeriod;

	public Electronics(int productId, String productName, String description, double price, int quantityInStock,
			String type) {
		super(productId, productName, description, price, quantityInStock, type);
		this.brand = brand;
		this.warrantyPeriod = warrantyPeriod;
	}

}
