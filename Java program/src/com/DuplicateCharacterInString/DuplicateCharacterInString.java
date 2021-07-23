package com.DuplicateCharacterInString;

import java.util.Scanner;

public class DuplicateCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter = 0, start, j;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any String");
		String string = sc.nextLine();
		char ch[] = string.toCharArray();
		/*
		 * it will compare first character of string with remaining character of string
		 * similarly second with remaining and so on there is possibility of same
		 * character can occur more time so that i set condition for that character so
		 * it will not check that character again. and even if one character match with
		 * other character,then counter will increase and if counter found as increase
		 * then the character could be duplicate.
		 */
		System.out.println("duplicate character in String :");
		for (start= 0; start < ch.length; start++) {
			counter = 0;
			if (ch[start] != '1') {
				for (j = start + 1; j < ch.length; j++) {
					if (ch[start] == ch[j]) {
						counter++;
						ch[j] = '1';
					}
				}
				if (counter >= 1) {
					System.out.println(ch[start]);
				}
			}

		}
	}
}
