package com.EqualAndHashcode;

import java.util.LinkedHashSet;

class Company{
	private int id;
	private String name;
	private String sal;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSal() {
		return sal;
	}
	public void setSal(String sal) {
		this.sal = sal;
	}
	public Company(int id, String name, String sal) {
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	public boolean equals(Object obj)
	{
		Company c=(Company)obj;
		if(this.name==c.name&&this.id==c.id&&this.sal==c.sal)
		{
			return true;
		}
		else
		{
		return false;
	}
	}
		public int hashCode()
		{
			return id*10;
		}
	
}

public class EqualAndHashcodeMethodApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company c=new Company(4,"raj","23000");
		Company c1=new Company(6,"bala","90000");
		Company c2=new Company(1,"ravi","20000");
		Company c3=new Company(8,"jinu","70000");
		Company c4=new Company(4,"raj","23000");
		if(c.equals(c4))
		{
			System.out.println("objects are equal..");
		}
		else
		{
			System.out.println("objects are not equal..");
		}
		LinkedHashSet<Company> hs=new LinkedHashSet<Company>();
		hs.add(c);
		hs.add(c1);
		hs.add(c2);
		hs.add(c3);
		hs.add(c4);
		for(Company comp:hs)
		{
			System.out.println(comp.getId()+"\t"+comp.getName()+"\t"+comp.getSal());
		}
		
	}

}
