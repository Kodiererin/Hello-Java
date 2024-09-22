package learn_OOPs;
class Father
{
	Father()
	{
		System.out.println("The Main Class That has been instiated");
	}
	Father(int x , int y)
	{
		System.out.println("The Main Class with Constructor Overloading has been initiated");
	}
}
class Son extends Father
{
	Son()
	{
		System.out.println("Hello ");
	}
}

public class Concepts_Inheritance_Constructors 
{
	public static void main(String[] args)
	{
		Son s = new Son();
	}
}
