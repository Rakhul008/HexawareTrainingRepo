package com.ordermanagement.main;

import java.util.List;

import com.ordermanagement.dao.OrderProcessorDaoImpl;
import com.ordermanagement.model.Products;
import com.ordermanagement.model.User;

;

public class OrderManagement {
	public static void main(String args[]) {
		Products products=new Products(11,"Vicks","Feels Good",200,2,"Good");
		Products products1=new Products(12,"ZanduBalm","Head Ache Releif",100,1,"Good");
		Products products2=new Products(13,"Volini","Muscular Pain",200,2,"Moderate");
		Products products3=new Products(15,"Ramon Balm"," Joint Ache Releif",120,1,"hard");
		OrderProcessorDaoImpl ServiceProvider= new OrderProcessorDaoImpl();
//		ServiceProvider.createProducts(products);
//		ServiceProvider.createProducts(products1);
//		ServiceProvider.createProducts(products2);
		ServiceProvider.createProducts(products3);

		
		User user=new User(03,"Thalapathy","thalapthy123","Actor");
		User user1=new User(04,"Thala","thala123","Actor");

		OrderProcessorDaoImpl ServiceProvider1= new OrderProcessorDaoImpl();
		ServiceProvider1.createUser(user);
		ServiceProvider1.createUser(user1);
		
//		Products products11 = new Products. getAllProducts("Good");
//		if (products11 != null) {
//			System.out.println("ProductId:"+products11.getProductName());
//	        System.out.println("ProductName: " + products11.getProductName());
//	        System.out.println("Description: " + products11.getDescription());
//	        System.out.println("Price: " + products11.getPrice());
//	        System.out.println("Type: " + products11.getType());
//	     } else {
//	         System.out.println("No customer found");
//	     }
//	     
//		List<Products> products111 = ServiceProvider.getAllProducts();
//		for (Products nproduct : products111)
//		    System.out.println(nproduct);
//
	}

}