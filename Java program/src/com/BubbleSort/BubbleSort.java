package com.BubbleSort;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp, i, j;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of  Array");
		int array_size = sc.nextInt();
		int array[] = new int[array_size];
		System.out.println("enter elements in an Array");
		for (i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("Before sorting");
		for (i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		for (i = 0; i < array.length; i++) {
		for (j = 1; j < array.length-i; j++) {
				if (array[j-1] > array[j]) {
					temp = array[j-1];
					array[j-1] = array[j];
					array[j] = temp;
					
				}
			}
		}
		System.out.println("After sorting");
		for (i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		
	}
}
