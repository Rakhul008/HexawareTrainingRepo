package com.techshop.model;

public class Customers {
	private int customerID;
	private String firstName, lastName, email, phone, address;

	public Customers(int customerID, String firstName, String lastName, String email, String phone, String address) {
		super();
		this.customerID = customerID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.address = address;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String toString() {
		return "Customers [customerId=" + customerID + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", email=" + email + ", phone=" + phone + ", address=" + address + "]";
	}


	public void updateCustomerInfo(String email, String phone, String address) {
		this.email = email;
		this.phone = phone;
		this.address = address;
	}
	
	public void getCustomerDetails() {
		
	}

	public void calculateTotalOrders() {
		
	}
}
