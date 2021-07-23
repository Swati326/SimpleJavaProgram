package com.PrimeNumberUptoGivenNumber;

import java.util.Scanner;

public class PrimeNumberUptoGivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number to find prime number ");
		int counter = 0;
		int number = sc.nextInt();
		int start, i;
		System.out.println("prime numbers between 1 to " + number + " are following:");
		for (i = 2; i <= number; i++) {
			counter = 0;
			for (start = 2; start <= number; start++) {
				if (i % start == 0 && i % 1 == 0) {
					counter++;
				}
			}

			if (counter == 1) {
				System.out.println(i);
			}
		}

	}

}
