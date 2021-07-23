package com.FindDuplicateNumber;

import java.util.Scanner;

public class FindDuplicateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter = 0, start, j,temp=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of  Array");
		int array_size = sc.nextInt();
		int array[] = new int[array_size];
		System.out.println("enter elements in an Array");
		for (start = 0; start < array.length; start++) {
			array[start] = sc.nextInt();
		}
		System.out.println("Duplicate elements present in an array:");
		for (start = 0; start < array.length; start++) {
			counter = 0;
			if(array[start]!=-1)
			{
			for (j = start + 1; j < array.length; j++)
			{
				if (array[start] == array[j]) {
					counter++;
					array[j]=-1;
					temp++;
				}
			}
			if (counter >= 1)
			{
				System.out.print(array[start] + "\t");
			}
		}
		}
		if(temp==0)
		{
			System.out.println("No duplicate element found");
		}

	}

}
