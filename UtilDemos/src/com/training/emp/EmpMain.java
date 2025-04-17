package com.training.emp;

import java.util.ArrayList;
import java.util.List;

public class EmpMain {

	public static void main(String[] args) {
		Employee employee1=new Employee("Ram",01,"Chennai",500);
		Employee employee2=new Employee("Raj",02,"Cbe",1500);
		Employee employee3=new Employee("Ram",03,"Banglore",2500);
		Employee employee4=new Employee("Ram",04,"Erode",3500);
		Employee employee5=new Employee("Ram",05,"Salem",4500);
		
		List <Employee>employeeList=new ArrayList<>();
		employeeList.add(employee1);
		employeeList.add(employee2);
		employeeList.add(employee3);
		employeeList.add(employee4);
		employeeList.add(employee5);

		for(Employee employee:employeeList) {
			System.out.println(employee);
		}
		
		
	}

}
