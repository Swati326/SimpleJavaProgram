package com.PowerOfTwoOrNot;

import java.util.Scanner;

public class PowerOfTwoOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,counter=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		double x=(double) (Math.log(n)/Math.log(2));
			if(x%1==0)
			{
				System.out.println(+n+":is power of two");
				
			}
			else
			{
				System.out.println(+n+":is not power of two");
			}
		}
}
