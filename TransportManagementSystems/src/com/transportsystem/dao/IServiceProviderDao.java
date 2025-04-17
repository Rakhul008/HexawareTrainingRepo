package com.transportsystem.dao;

import java.util.List;

import com.transportsystem.model.Bookings;
import com.transportsystem.model.Vehicles;

public interface IServiceProviderDao {

	void addVehicles(Vehicles vehicle);



	void updateVehicle(String type, String model);



	public void deleteVehicle(String model);



	



	void cancelTrip(int i);


	}
	
	

