package com.FibonacciSeries;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number to check fibonacci series");
		int number = sc.nextInt();
		System.out.println("Fibonacci series :");
		int start, first = 0, second = 1, last = 0;
		System.out.print(0 + "\t");
		System.out.print(1);
		//loop start from 2 because 0 and 1 already printed.
		for (start = 2; start < number; start++) {
			last = first + second;
			first = second;
			second = last;
			System.out.print("\t" + last);
		}

	}

}
