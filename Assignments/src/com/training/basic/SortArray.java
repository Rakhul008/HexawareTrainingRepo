package com.training.basic;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		int arr[] = new int[] { 5, 31, 35, 43 };
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
