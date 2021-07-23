package com.Permutation;

import java.util.Scanner;

public class PermutationString {

	
    public static void printArray(char ch[])
    {
        for(int i=0;i<ch.length;i++)
        
            System.out.print(ch[i]+" ");
            System.out.println("");
        
    }
    public static void swap(char ch[],int i,int j)
    {
        char temp=ch[i];
        ch[i]=ch[j];
        ch[j]=temp;
    }
    public static void printPermutation(char ch[],int cid)
    {
    	
        if(cid==ch.length-1)
        {
            printArray(ch);
            return;
        }
    for(int i=cid;i<ch.length;i++)
    {
      
		swap(ch,i,cid);
        printPermutation(ch,cid+1);
        swap(ch,i,cid);
    }
}
    public static void main(String[] args)
    
    {
    	System.out.println("enter the string");
    	Scanner sc=new Scanner(System.in);
    	String str=sc.nextLine();
    	char ch[]=str.toCharArray();
        printPermutation(ch,0);
    }

}
