package com.transportsystem.main;

import java.util.List;

import com.transportsystem.dao.IServiceProviderDao;
import com.transportsystem.dao.ServiceProviderDaoImpl;
import com.transportsystem.model.Vehicles;

public class MainModule {
	
	public static void main(String args[]) {
		Vehicles vehicle=new Vehicles(1,"A1",100,"Bike","Available");
		Vehicles vehicle1=new Vehicles(2,"A2",200,"Cycle","Not Available");
		Vehicles vehicle2=new Vehicles(3,"A3",300,"Car","Available");
		Vehicles vehicle3=new Vehicles(4,"A3",400,"Bus","Available");
		Vehicles vehicle4=new Vehicles(5,"A3",500,"Taxi","Not Available");
		Vehicles vehicle5=new Vehicles(6,"A3",600,"Cab","Available");
		Vehicles vehicle6=new Vehicles(7,"A3",700,"Auto","Not Available");

		
		IServiceProviderDao ServiceProvider= new ServiceProviderDaoImpl();
		ServiceProvider.addVehicles(vehicle);
		ServiceProvider.addVehicles(vehicle1);
		ServiceProvider.addVehicles(vehicle2);
		ServiceProvider.addVehicles(vehicle3);
		ServiceProvider.addVehicles(vehicle4);
		ServiceProvider.addVehicles(vehicle5);
		ServiceProvider.addVehicles(vehicle6);

		
		IServiceProviderDao ServiceProvider1= new ServiceProviderDaoImpl();
		ServiceProvider1.updateVehicle("Maximum Available","A1");
		ServiceProvider1.deleteVehicle("A2");
		ServiceProvider1.cancelTrip(1);
		

		
			}

}
