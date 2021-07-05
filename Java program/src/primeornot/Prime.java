package primeornot;

import java.util.Scanner;

public class Prime {
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
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
			System.out.println("no its not prime");
		}
	}

}
