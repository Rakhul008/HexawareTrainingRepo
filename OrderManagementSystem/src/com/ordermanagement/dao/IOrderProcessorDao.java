package com.ordermanagement.dao;

import java.util.List;


import com.ordermanagement.model.Products;
import com.ordermanagement.model.User;

 interface IOrderProcessorDao {

	void createProducts(Products products);

	void createUser(User user);
	
	List<Products> getAllProducts();
	List<Products> getByType(String type);
	
}
