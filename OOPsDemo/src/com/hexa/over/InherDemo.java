package com.hexa.over;

public class InherDemo {

	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle("RX100", 10000);
		vehicle.printDetails();

		Vehicle vehicle1 = new Vehicle("R15", 102000);
		vehicle1.printDetails();

		Vehicle vehicle2 = new Vehicle("NS200", 20000);
		vehicle2.model = "NS200";
		vehicle2.price = 200000;
		vehicle2.printDetails();

		Car car = new Car("Kwid", 50000, "Seat Belt");
		car.accessories = "Seat Belt";
		car.printDetails();
		car.showAccessories();
	}

}
