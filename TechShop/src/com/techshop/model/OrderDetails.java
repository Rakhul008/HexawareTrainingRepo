package com.techshop.model;

public class OrderDetails {
	private int orderDetailID;
	private Orders order;
	private Products product;
	private int quantity;

	public OrderDetails(int orderDetailID, Orders order, Products product, int quantity) {
		super();
		this.orderDetailID = orderDetailID;
		this.order = order;
		this.product = product;
		this.quantity = quantity;
	}

	public int getOrderDetailID() {
		return orderDetailID;
	}

	public void setOrderDetailID(int orderDetailID) {
		this.orderDetailID = orderDetailID;
	}

	public Orders getOrder() {
		return order;
	}

	public void setOrder(Orders order) {
		this.order = order;
	}

	public Products getProduct() {
		return product;
	}

	public void setProduct(Products product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double calculateSubtotal() {
		return product.getPrice() * quantity;
	}

	public String toString() {
		return "OrderDetails [orderDetailId=" + orderDetailID + ", order=" + order + ", quantity=" + quantity + "]";
	}

	public void calculateSubTotal() {

	}

	public void getOrderDetailInfo() {

	}

	public void updateQuantity() {

	}

	public void addDiscount() {

	}

}
