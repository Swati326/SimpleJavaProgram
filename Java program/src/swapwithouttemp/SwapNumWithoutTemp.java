package swapwithouttemp;

import java.util.Scanner;

public class SwapNumWithoutTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		int First_Num=sc.nextInt();
		System.out.println("enter first number");
		int Second_Num=sc.nextInt();
		System.out.println("Before Swapping");
		System.out.println("FirstNumber="+First_Num+"\tSecondNumber="+Second_Num);
		First_Num=First_Num+Second_Num;
		Second_Num=First_Num- Second_Num;
		First_Num=First_Num- Second_Num;
		System.out.println("After Swapping");
		System.out.println("FirstNumber="+ First_Num+"\tSecondNumber="+ Second_Num);
		/*
	 	another way
		First_Num=First_Num*Second_Num;
		Second_Num=First_Num/Second_Num;
		First_Num=First_Num/Second_Num;
	System.out.println("First_Num="+First_Num+"\tSecond_Num="+Second_Num);
		*/

	}

}
