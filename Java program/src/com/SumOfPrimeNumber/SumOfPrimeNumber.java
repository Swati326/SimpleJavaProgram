package com.SumOfPrimeNumber;

import java.util.Scanner;

public class SumOfPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int counter = 0, sum = 0, temp = 0;
		int number = 2;
		System.out.println("The sum of first " + 1000 + " prime numbers is:");
		//here we want sum of 1000 prime numbers so initially counter is set as zero whenever counter reaches 1000 it will find first
		//1000 prime numbers . and it check number is prime or not if yes the it add so on...
		while (counter < 1000) {
			temp = 0;
			for (int i = 2; i <= number / 2; i++) {

				if (number % i == 0) {
					temp++;
				}

			}
			if (temp == 0) {

				sum = sum + number;
				counter++;
			}
			number++;
		}
		System.out.println(sum);
	}
}


