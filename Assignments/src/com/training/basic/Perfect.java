package com.training.basic;

public class Perfect {

	public static void main(String[] args) {
		int num = 28, sum = 0;
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0)
				sum += i;
		}
		if (num == sum) {
			System.out.println("Perfect");
		} else {
			System.out.print("Not a Perfect");
		}
	}
}
