package com.training.emp;

public class Employee {
	
	private String empName;
	private int empId;
	private String city;
	private double salary;
	
	public Employee(String empName, int empId, String city, double salary) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.city = city;
		this.salary = salary;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	

	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + ", city=" + city + ", salary=" + salary + "]";
	}
	

}
