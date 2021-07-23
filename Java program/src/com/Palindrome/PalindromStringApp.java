package com.Palindrome;

import java.util.*;

public class PalindromStringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, counter = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter String to check whether the string is palindrome or not");
		String string = sc.nextLine();
		char ch[] = string.toCharArray();
		char ch1[] = new char[ch.length];
		for (i = ch.length - 1; i >= 0; i--) {
			ch1[i] = ch[i];
		}
		int j = ch.length - 1;
		for (i = 0; i < ch.length; i++) {
			if (ch1[j] == ch[i]) {
				counter++;

			}
			j--;
		}
		if (counter == ch.length) {
			System.out.printf("string is palindrome");
		} else {
			System.out.printf("string is not palindrome");
		}
	}
}
