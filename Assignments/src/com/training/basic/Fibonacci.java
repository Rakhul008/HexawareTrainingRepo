package com.training.basic;

public class Fibonacci {

	public static void main(String[] args) {
		int a=0;int b=1;
		while(b<=100){
			System.out.print(b+" ");
			int temp=b;;
			b=a+b;
			a=temp;
		}
	}

}
