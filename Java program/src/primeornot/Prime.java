package primeornot;

import java.util.Scanner;

public class Prime {
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int count=0;
		int n=sc.nextInt();
		int i;
		for(i=2;i<=n;i++)
		{
			if(n%i==0 && n%1==0)
			{
				count++;
			}
		}
		if(count==1)
		{
			System.out.println("yes,prime");
		}
		else
		{
			System.out.println("no its not prime");
		}
	}

}
