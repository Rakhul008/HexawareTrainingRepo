package com.hexa.arrays;

public class Arrays {

	public static void main(String[] args) {
		int arr[] = new int[] { 100, 200, 300, 400 };
		System.out.println("Length" + " " + arr.length);
		System.out.print(arr[1]);
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println(" "+sum);
	}

}
