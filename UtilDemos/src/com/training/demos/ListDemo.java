package com.training.demos;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		List<String> fruits=new ArrayList();
		fruits.add("apple");
		fruits.add("orange");
		fruits.add("mango");
		fruits.add("apple");
		fruits.add("1");
		
		System.out.println(fruits);
		
		for(Object fruit:fruits) {
			String f=(String) fruit;
			System.out.println(f.toUpperCase());
		}
		
	}

}
