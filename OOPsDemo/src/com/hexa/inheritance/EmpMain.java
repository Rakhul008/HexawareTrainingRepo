package com.hexa.inheritance;

public class EmpMain {

	public static void main(String[] args) {
		Employee employee=new Employee("Raj", 5000);
		employee.printDetails();
		Employee employee1=new Employee("Ram", 15000);
		employee1.printDetails();
		
		System.out.println();
		Manager manager=new Manager("Bala",300,"Chennai");
		manager.printDetails();
		
		manager.showCity();
	}

}
