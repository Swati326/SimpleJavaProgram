package com.PrimeOrNot;

import java.util.Scanner;

public class Prime {
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to check whether the number is prime or not");
		int counter=0;
		int number=sc.nextInt();
		int start;
		for(start=2;start<=number;start++)
		{
			if(number%start==0 && number%1==0)
			{
				counter++;
			}
		}
		if(counter==1)
		{
			System.out.println("yes,prime");
		}
		else
		{
			System.out.println("no it's not prime");
		}
	}

}
