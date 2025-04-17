package com.ordermanagement.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.ordermanagement.model.Products;
import com.ordermanagement.model.User;
import com.ordermanagement.util.DbConnectionUtil;

public class OrderProcessorDaoImpl implements IOrderProcessorDao {

	Connection connection;

	@Override
	public void createProducts(Products products) {

		connection = DbConnectionUtil.getConnection();
		String sql = "insert into products values(?,?,?,?,?,?)";
		PreparedStatement statement = null;

		try {
			statement = connection.prepareStatement(sql);
			statement.setInt(1, products.getProductId());
			statement.setString(2, products.getProductName());
			statement.setString(3, products.getDescription());
			statement.setDouble(4, products.getPrice());
			statement.setInt(5, products.getQuantityInStock());
			statement.setString(6, products.getType());
			statement.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				statement.close();
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public void createUser(User user) {

		connection = DbConnectionUtil.getConnection();
		String sql = "insert into user values(?,?,?,?)";
		PreparedStatement statement = null;

		try {
			statement = connection.prepareStatement(sql);
			statement.setInt(1, user.getUserId());
			statement.setString(2, user.getUsername());
			statement.setString(3, user.getPassword());
			statement.setString(4, user.getRole());
			statement.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				statement.close();
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public Products getAllProducts(String type) {
		// TODO Auto-generated method stub
		connection = DbConnectionUtil.getConnection();

		String sql = "Select * from Customer where type = ?";

		PreparedStatement statement = null;
		Products Products = null;

		try {
			statement = connection.prepareStatement(sql);

			statement.setString(1, type);

			ResultSet rs = statement.executeQuery();
			while (rs.next()) {
				int productId = rs.getInt("productId");
				String productName1 = rs.getString("ProductName");
				String description = rs.getString("description");
				Double price = rs.getDouble("price");
				int quantityInStock = rs.getInt("quantityInStock");
				String type1 = rs.getString("type");

				Products = new Products(productId, productName1, description, price, quantityInStock, type1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				statement.close();
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return Products;
	}

	@Override
	public List<Products> getAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Products> getByType(String type) {
		// TODO Auto-generated method stub
		return null;
	}

}
