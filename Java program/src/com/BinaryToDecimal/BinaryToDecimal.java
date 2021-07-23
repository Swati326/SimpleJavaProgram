package com.BinaryToDecimal;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long reminder, decimal = 0, base = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter binary number to convert in decimal number");
		long binary = sc.nextLong();
		System.out.println("Conversion of binary to decimal is:");
		while (binary > 0) {
			reminder = binary % 10;
			decimal = decimal + reminder * base;
			base = base * 2;
			binary = binary / 10;
		}
		System.out.println(decimal);

	}

}
