package com.ArmstrongOrNot;

import java.util.Scanner;

public class ArmstrongOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter=0,reminder, sum=0,power=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number to check whether number is armstrong or not");
		int number = sc.nextInt();
		int temp=number;
		while (number != 0)
		{
			reminder = number % 10;
			number = number / 10;
			counter++;
		}
		number=temp;
		while (number != 0)
		{
			reminder = number % 10;
		    power=1;
			for(int start=1;start<=counter;start++)
			{
			power=power*reminder;
			}
			sum=sum+power;
			number = number / 10;
		}
		if(sum==temp)
		{
			System.out.println(+temp+ " is a Armstrong number");
		}
		else
		{
			System.out.println(+temp+ " is not a Armstrong number");
		}
	}
}
