package com.TopTwoMaximunNumbersInArray;

import java.util.Scanner;

public class TopTwoMaximunNumbersInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp, i, j,counter=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of  Array");
		int array_size = sc.nextInt();
		int array[] = new int[array_size];
		System.out.println("enter elements in an Array");
		for (i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("After descending");
		for (i = 0; i < array.length; i++) {
			for (j = i + 1; j < array.length; j++) {
				if (array[i] < array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		for (i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

		System.out.println("Top Two Maximum elements in an array are:");
		for (i = 0; i < array.length; i++) {
			counter = 0;
			for (j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) 
				{
					counter++;
				}
			}
			if (counter == 0) {
				System.out.println(+array[i]+" and " +array[i + 1]);
				break;
			}
		}
	}

}