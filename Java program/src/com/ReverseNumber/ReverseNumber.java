package com.ReverseNumber;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long reminder, reverse = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		long number = sc.nextLong();
		System.out.println("Reverse number of " + number + " is:");
		while (number != 0) {
			reminder = number % 10;
			number = number / 10;
			reverse = reminder + reverse * 10;
		}
		System.out.println(reverse);
	}

}
