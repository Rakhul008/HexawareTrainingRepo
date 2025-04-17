package com.techshop.model;

import java.time.LocalDate;

public class Inventory {

	private Products product;
	private int quantityInStock;
	private LocalDate lastStockUpdate;
	private int inventoryID;

	public Inventory(int inventoryID, Products product, int quantityInStock, LocalDate lastStockUpdate) {
		super();
		this.inventoryID = inventoryID;
		this.product = product;
		this.quantityInStock = quantityInStock;
		this.lastStockUpdate = lastStockUpdate;
	}

	public Products getProduct() {
		return product;
	}

	public void setProduct(Products product) {
		this.product = product;
	}

	public LocalDate getLastStockUpdate() {
		return lastStockUpdate;
	}

	public void setLastStockUpdate(LocalDate lastStockUpdate) {
		this.lastStockUpdate = lastStockUpdate;
	}

	public int getInventoryID() {
		return inventoryID;
	}

	public void setInventoryID(int inventoryID) {
		this.inventoryID = inventoryID;
	}

	public void setQuantityInStock(int quantityInStock) {
		this.quantityInStock = quantityInStock;
	}

	public String toString() {
		return "Inventory [inventoryID=" + inventoryID + ", product=" + product + ", quantityInStock=" + quantityInStock
				+ ", lastStockUpdate=" + lastStockUpdate + "]";
	}

	public void getTheProduct() {

	}

	public void getTheQuantityInStock() {

	}

	public int addToInventory(int quantity) {
		return quantity;
	}

	public int removeFromInventory(int quantity) {
		return quantity;
	}

	public int updateStockQuantity(int quantity) {
		return quantity;
	}

	public int isProductAvailable(int quantityToCheck) {
		return quantityToCheck;
	}

	public void inventoryValue() {

	}

	public int listLowStockProducts(int threshold) {
		return threshold;
	}

	public void listOutOfStockProducts() {

	}

	public void listAllProducts() {

	}

}
