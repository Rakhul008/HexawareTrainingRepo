package com.training.demos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertTable {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/training";
		String username = "root";
		String password = "Rakhul_007";

		String sql = "insert into student values(?,?,?)";
		Connection connection = null;
		PreparedStatement statement = null;
		
		try {
			connection = DriverManager.getConnection(url, username, password);
			statement = connection.prepareStatement(sql);
			statement.setString(1,"Rakhul");
			statement.setInt(2,10);
			statement.setString(3,"ECE");
			
			boolean result = statement.execute();
			System.out.println("Values Inserted " + !result);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				statement.close();
				connection.close();
			} catch (SQLException e) {

			}
		}

	}

}
