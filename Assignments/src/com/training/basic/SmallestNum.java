package com.training.basic;

public class SmallestNum {

	public static void main(String[] args) {
		int arr[] = new int[] { 600, 200, 300, 400, 500 };
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min)
				min = arr[i];
		}
		System.out.print(min);
	}

}
