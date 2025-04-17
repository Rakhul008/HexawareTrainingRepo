package com.training.demos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectTable {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/training";
		String username = "root";
		String password = "Rakhul_007";
		String sql = "select*from student where student_id=?1";
		Connection connection = null;
		PreparedStatement statement = null;

		try {
			connection = DriverManager.getConnection(url, username, password);
			statement = connection.prepareStatement(sql);
			statement.setInt(1,10);
			ResultSet rs = statement.executeQuery();
			while(rs.next()) {
				String studentName=rs.getString("student_name");
				int studentId=rs.getInt("student_id");
	
				String department=rs.getString(3);
				System.out.println(studentName+" "+studentId+" "+department);
			}

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
