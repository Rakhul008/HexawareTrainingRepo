package com.hexa.overriding;

public class OverridingDemo {

	public static void main(String[] args) {
		TwoWheeler wheeler = new Bike("Rx", "Bajaj", 4900);
		wheeler.printDetails();
		wheeler.getMileage();
		
		String accessories [] = wheeler.showAccessories();
        for (String accessory  : accessories) {
        	System.out.println(accessories);
        }
 
	}
}
