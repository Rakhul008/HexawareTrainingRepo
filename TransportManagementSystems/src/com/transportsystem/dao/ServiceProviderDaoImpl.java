package com.transportsystem.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.tranaportsystem.util.DbConnectionUtil;
import com.tranaportsystem.util.DbPropertiesUtil;
import com.transportsystem.model.Bookings;
import com.transportsystem.model.Vehicles;

public class ServiceProviderDaoImpl implements IServiceProviderDao {
	Connection connection;

	@Override
	public void addVehicles(Vehicles vehicle) {

		connection = DbConnectionUtil.getConnection();
		String sql = "insert into vehicles values(?,?,?,?,?)";
		PreparedStatement statement = null;

		try {
			statement = connection.prepareStatement(sql);
			statement.setInt(1, vehicle.getVehicleId());
			statement.setString(2, vehicle.getModel());
			statement.setInt(3, vehicle.getCapacity());
			statement.setString(4, vehicle.getType());
			statement.setString(5, vehicle.getStatus());
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

	public void updateVehicle(String type, String model) {
		connection = DbConnectionUtil.getConnection();
		String sql = "update vehicles set type=? where model=?";
		PreparedStatement statement = null;

		try {
			statement = connection.prepareStatement(sql);
			statement.setString(1, type);
			statement.setString(2, model);
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

	public void deleteVehicle(String model) {
		// TODO Auto-generated method stub
		connection = DbConnectionUtil.getConnection();

		String sql = "Delete from vehicles where model = ?";

		PreparedStatement statement = null;
		try {
			statement = connection.prepareStatement(sql);

			statement.setString(1, model);

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

	public void cancelTrip(int tripId) {
		// TODO Auto-generated method stub
		connection = DbConnectionUtil.getConnection();

		String sql = "Delete from trips where tripId = ?";

		PreparedStatement statement = null;
		try {
			statement = connection.prepareStatement(sql);

			statement.setInt(1, tripId);

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

}
