package com.training.basic;


public class GreaterNum {

	public static void main(String[] args) {
		int arr[] = new int[] { 100, 200, 300, 400, 500 };
		int max=0;
		for(int i=0;i<arr.length;i++) {
		if(arr[i]>max)
			max=arr[i];
		}
		System.out.print(max);
}
}
