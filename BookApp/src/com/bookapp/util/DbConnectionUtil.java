package com.bookapp.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class DbConnectionUtil {

	static Connection connection;

	public static Connection getConnection() {
			Properties properties=DbPropertiesUtil.getPropertiesUtil();
			String url=properties.getProperty("db.url");
			String username=properties.getProperty("db.username");
			String password=properties.getProperty("db.password");


			try {
				connection = DriverManager.getConnection(url, username, password);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
			return connection;
    }
}