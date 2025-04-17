package com.hexa.basics;

public class Student {

	String studentName;
	String city;

	public static void main(String[] args) {
		Student student = new Student();
		student.studentName = "Ruturaj";
		student.city = "Maharastra";
		System.out.println("Name :" + student.studentName);
		System.out.println("City: " + student.city);

		Student student1 = new Student();
		student1.studentName = "Gaikwad";
		student1.city = "Chennai";
		System.out.println("Name :" + student1.studentName);
		System.out.println("City: " + student1.city);

		Student student2 = new Student();
		student2.studentName = "MS Dhoni";
		student2.city = "Ranchi";
		System.out.println("Name :" + student2.studentName);
		System.out.print("City: " + student2.city);
	}

}
