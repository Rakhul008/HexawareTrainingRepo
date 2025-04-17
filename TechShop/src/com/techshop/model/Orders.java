package com.techshop.model;

import java.time.LocalDate;

public class Orders {

	private int orderID;
	private Customers customer;
	private LocalDate orderDate;
	private double totalAmount;

	public Orders(int orderID, Customers customer, LocalDate orderDate, double totalAmount) {
		super();
		this.orderID = orderID;
		this.customer = customer;
		this.orderDate = orderDate;
		this.totalAmount = totalAmount;
	}

	public int getOrderID() {
		return orderID;
	}

	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}

	public Customers getCustomer() {
		return customer;
	}

	public void setCustomer(Customers customer) {
		this.customer = customer;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public void calculateTotalAmount(double total) {
		this.totalAmount = total;
	}

	public String toString() {
		return "Orders [ordersId=" + orderID + ", customer=" + customer + ", orderDate=" + orderDate + ", totalAmount="
				+ totalAmount + "]";
	}

	public void CalculatetotalAmount() {

	}

	public void getOrderDetails() {

	}

	public void updateOrderStatus() {

	}

	public void cancelOrder() {

	}
}
