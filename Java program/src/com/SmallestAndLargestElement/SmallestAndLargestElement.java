package com.SmallestAndLargestElement;

import java.util.Scanner;

public class SmallestAndLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of  Array");
		int array_size = sc.nextInt();
		int array[] = new int[array_size];
		System.out.println("enter elements in an Array");
		for (i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		// sorting operation is performed
		for (i = 0; i < array.length; i++) {
			for (j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}

		System.out.println("The smallest number in array is:" + array[0]);
        System.out.println("The largest element in array is:" + array[array.length - 1]);
	}

}
