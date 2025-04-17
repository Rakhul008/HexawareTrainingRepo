package com.hexa.basics;

public class TypeCast {

	public static void main(String[] args) {
		//upcasting
		byte b=100;
		int x =b*2;
		long y=x+1000;
		double z=y*3;
		System.out.println(z);
		
		//downcasting
		double num=45.3;
		long num1=(long)num;
		int num2=(int)num1;
		System.out.print(num2);
		
		float c=1.1f;
		num=233.34;
		float num6=(float)num;
		System.out.print(num6);
	}

}
