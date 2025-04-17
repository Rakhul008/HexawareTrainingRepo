package com.ordermanagement.model;

public class Clothing extends Products {
	private String size;
	private String color;

	public Clothing(int productId, String productName, String description, double price, int quantityInStock,
			String type) {
		super(productId, productName, description, price, quantityInStock, type);
		this.color = color;
		this.size = size;
	}

}
