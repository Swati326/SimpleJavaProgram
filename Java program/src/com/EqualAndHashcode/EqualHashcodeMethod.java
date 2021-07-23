package com.EqualAndHashcode;

 class Pen{
	 String color;
	 int price;
	public Pen(String color,int price)
	 {
		 this.color=color;
		 this.price=price;
	 }
	public boolean equals(Object obj)
	{
		Pen p=(Pen)obj;
		if(this.price==p.price)
		{
			return true;
		}
		else
		{
		return false;
	}
 }
	public int hashcode()
	{
		return price;
	}
 }
public class EqualHashcodeMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pen p1=new Pen("blue",10);
		Pen p2=new Pen("blue",10);
		System.out.println(System.identityHashCode(p1));
		System.out.println(System.identityHashCode(p2));
		System.out.println("object first " +p1.hashcode());
		System.out.println("object second " +p2.hashcode());
		if(p1.equals(p2))
		{
			System.out.println("objects are equal");
		}
		else
		{
			System.out.println("Objects are not equal");
		}
	}

}
