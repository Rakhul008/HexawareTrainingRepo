package com.training.basic;

import java.util.Arrays;

public class LargeSecond {

    public static void main(String[] args) {
        int arr[] = new int[] {400, 200, 100, 300};
        Arrays.sort(arr);    
        System.out.println(arr[arr.length - 2]);
    }

}
