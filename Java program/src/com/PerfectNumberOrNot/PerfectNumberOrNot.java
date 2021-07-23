package com.PerfectNumberOrNot;

import java.util.Scanner;

public class PerfectNumberOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int factor = 1, start, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int number = sc.nextInt();
		for (start = 1; start < number; start++) {
			if (number % start == 0) {
				factor = factor * start;
				sum = sum + start;
			}
		}
		if (sum == number) {
			System.out.println(+number + " is a perfect number");
		} else {
			System.out.println(+number + " is not a perfect number");
		}

	}

}
