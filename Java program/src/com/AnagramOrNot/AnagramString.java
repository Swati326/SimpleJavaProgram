package com.AnagramOrNot;

import java.util.*;

public class AnagramString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i, counter = 0, j;
		System.out.println("enter first string");
		String string_1 = sc.nextLine();
		System.out.println("enter second string");
		String string_2 = sc.nextLine();
		char ch1[] = string_1.toCharArray();
		char ch2[] = string_2.toCharArray();
		/*
		 * here checked whether the characters of first string are match with characters
		 * of second string and if match the counter will increase.  
		 */
		for (i = 0; i < ch1.length; i++) {
			for (j = 0; j < ch2.length; j++) {
				if (ch1[i] == ch2[j]) {
					counter++;
					break;

				}
			}
		}
		// System.out.println(counter);
		/*
		 * here if counter is perfectly match with both the string lengths then string
		 * will be anagram otherwise string will be not anagram.
		 */
		if (counter == ch1.length && counter == ch2.length) {
			System.out.println("String is Anagram");
		} else {
			System.out.println("string is not anagram");
		}

	}

}
