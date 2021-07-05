package swapwithouttemp;

import java.util.Scanner;

public class SwapNumWithoutTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		int a=sc.nextInt();
		System.out.println("enter first number");
		int b=sc.nextInt();
		System.out.println("Before Swapping");
		System.out.println("a="+a+"\tb="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping");
		System.out.println("a="+a+"\tb="+b);
		/*
	 	another way
		a=a*b;
		b=a/b;
		a=a/b;
	System.out.println("a="+a+"\tb="+b);
		*/

	}

}
