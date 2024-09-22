package Practise_Experiments.copy2;

import java.util.Scanner;

class book<obj1>
{
	private String obj1;
	public String objcopy;
	public void setObj1(String obj1) 
	{
		this.obj1 = obj1;
	}
	public String getObj1() 
	{
		this.objcopy = obj1;
		return obj1;
	}
}
class author<obj2> extends book
{
	private String obj2;
	public String obj2Copy;
	public String getObj2() 
	{
		obj2Copy = obj2;
		return obj2;
	}
	public void setObj2(String obj2) 
	{
		this.obj2 = obj2;
	}
	public String test2()
	{
		return this.obj2Copy.toUpperCase();
	}
}
public class ujjwal_Library
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		book<String> b1 = new book<String>();
		author<String> b2 = new author<String>();
		System.out.println("Enter Book Name and Author Name");
		b1.setObj1(sc.nextLine());
		b2.setObj1(sc.nextLine());
		
		System.out.println("The Book Name is "+b1.getObj1()+"The Author Name is "+b2.test2());
		
	}
}