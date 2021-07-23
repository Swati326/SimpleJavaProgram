package com.CommonElementsBetweenTwoArray;

import java.util.Scanner;

public class CommonElementsBetweenTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter = 0, i, j;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size for First Array");
		int array_size1 = sc.nextInt();
		System.out.println("enter size for second  Array");
		int array_size2 = sc.nextInt();
		int array1[] = new int[array_size1];
		System.out.println("enter elements in first Array");
		for (i = 0; i < array1.length; i++) {
			array1[i] = sc.nextInt();
		}
		int array2[] = new int[array_size2];
		System.out.println("enter elements in second Array");
		for (i = 0; i < array2.length; i++) {
			array2[i] = sc.nextInt();
		}
		// it will compare first element of first array with all elements of second
		// array and so on..
		// and sometime there could be same number more time so here i set -1 as this
		// number so it will not count again
		// and even if one element match,the counter will increase and if counter found
		// as increase
		// then the element could be common.
		System.out.println("Common elements in Both Array :");
		for (i = 0; i < array1.length; i++) {
			counter = 0;
			if (array1[i] != -1) {
				for (j = 0; j < array2.length; j++) {
					if (array1[i] == array2[j]) {
						counter++;
						array2[j] = -1;
					}
				}
				if (counter >= 1) {
					System.out.println(array1[i]);
				}
			}

		}

	}
}
