package com.training.basic;

public class Duplicates {

	public static void main(String[] args) {
		int arr[] = new int[] { 1, 2, 3,2,4,3,5, 1 };
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					break;
				}
			}
		}
		System.out.print("Duplicates count: " + count);
	}
}
