package com.ArrayPairsSum;

import java.util.Scanner;

public class ArrayPairsSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter = 0, i, j, temp = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of  Array");
		int array_size = sc.nextInt();
		System.out.println("enter number");
		int number = sc.nextInt();
		int array[] = new int[array_size];
		System.out.println("enter elements in an Array");
		for (i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		
		//here it checks the  number which we have provides is equal or not  with sum of another numbers present in array
		//so the first element compare with all other elements in array similarly second compare with other so on..
		//there is possibility of same elements may be contain in array so if we got pair then it set as -1 so it does not compare again.
		//and no one any pair then temp variable will be zero .
		System.out.println("the sum of pairs is " + number + " are following");
		for (i = 0; i < array.length; i++) {
			if (array[i] != -1)
			{
				for (j = i + 1; j < array.length; j++) {
					counter = 0;
					if (number == array[i] + array[j]) {
						counter++;
					}
					if (counter == 1) {
						System.out.println("(" + array[i] + "," + array[j] + ")");
						array[j] = -1;
						temp++;
						break;
					}
				}

			}
		}
		if (temp == 0) {
			System.out.println("No pair found");
		}

	}

}
