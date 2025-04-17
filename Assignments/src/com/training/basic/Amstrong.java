package com.training.basic;

public class Amstrong {
	public static void main(String args[]) {
		int num = 153;
		int temp = num;
		int sum = 0;
		while (temp != 0) {
			int digit = temp % 10;
			sum += digit * digit * digit;
			temp /= 10;
		}
		if (num == sum) {
			System.out.print(num + " is a Amstrong Number");
		} else {
			System.out.print(num + " is not a Amstrong Number");
		}
	}
}
