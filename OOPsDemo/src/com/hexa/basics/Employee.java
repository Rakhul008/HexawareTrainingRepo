package com.hexa.basics;

public class Employee {
	
	String empName;
	double salary;


	Employee(String empName,double salary){
		this.empName=empName;
		this.salary=salary;
	}
	void printDetails() {
		System.out.println("name"+empName);
		System.out.println("salary"+salary);
	}
	String greet(){
		return "Great Day "+empName;
}
	void calcBonus(int amount)	{
		System.out.print("Bonus" +salary*amount);
	}
}
