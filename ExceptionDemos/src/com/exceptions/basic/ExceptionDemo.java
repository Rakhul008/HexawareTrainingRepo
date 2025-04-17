package com.exceptions.basic;

public class ExceptionDemo {
	public static void main(String args[]) {
		try {
			int x = Integer.parseInt("0");
			System.out.println(x);
			int y = 10000 / x;
			int arr[] = null;
			System.out.println(arr[1]);
			System.out.println(y);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("other");
		}
		finally {
			System.out.println("The END");
		}
		System.out.println("Continue");
	}
}