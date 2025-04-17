package com.techshop.model;

public class Products {
	private int productID;
	private String productName, description;
	private double price;

	public Products(int productID, String productName, String description, double price) {
		super();
		this.productID = productID;
		this.productName = productName;
		this.description = description;
		this.price = price;
	}

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String toString() {
		return "Products [productId=" + productID + ", productName=" + productName + ", description=" + description
				+ ", price=" + price + "]";
	}

	public void getProductDetails() {

	}

	public void updateProductInfo(String description, double price) {

	}

	public void IsProductInStock() {

	}

}
