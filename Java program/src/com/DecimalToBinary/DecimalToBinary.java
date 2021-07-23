package com.DecimalToBinary;

import java.util.*;

public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int reminder,quotient,counter=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter decimal number to convert in binary number");
		int decimal=sc.nextInt();
		int a[] =new int[40];
		int i=0;
		System.out.println("The conversion of decimal to binary number is:");
		while(decimal!=0)
		{
			counter++;
			quotient=decimal/2;
			a[i]=decimal%2;
			decimal=quotient;
			i++;
		}
		for(i=counter-1;i>=0;i--)
		{
			System.out.print(a[i]);
		}
	}

}
