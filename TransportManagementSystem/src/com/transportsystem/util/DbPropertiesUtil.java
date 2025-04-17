package com.transportsystem.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.transportsystem.util.DbPropertiesUtil;

public class DbPropertiesUtil {
	public static Properties getPropertiesUtil() {
		Properties properties = new Properties();
		InputStream inputStream = DbPropertiesUtil.class.getClassLoader().getResourceAsStream("jdbc.properties");
		try {
			properties.load(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return properties;
	}
}
