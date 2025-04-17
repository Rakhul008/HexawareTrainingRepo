package com.hexa.basics;

public class EmpMain {
	public static void main(String args[]) {
		
		Employee employee = new Employee("Rakhul", 8000);
		String result=employee.greet();
		System.out.println("Name " + employee.empName);
		System.out.println("Salary " + employee.salary);
		employee.calcBonus(2000);
		System.out.println();
		
		Employee employee1 = new Employee("Raj", 700);
		result=employee1.greet();
		System.out.println("Name " + employee1.empName);
		System.out.println("Salary " + employee1.salary);
		employee.calcBonus(2000);
	}
}
