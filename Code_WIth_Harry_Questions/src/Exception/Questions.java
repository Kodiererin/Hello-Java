// doubt has been created so please redo the code.
package Exception;

import java.util.Scanner;

class question1 
{
	private static final Exception IllegalArgumentException = null;
	Scanner sc = new Scanner(System.in);
//	Write a java program to demonstrate syntax, logical 2 runtime errors.
	public  void Question1()
	{
		try
		{
			System.out.println("Enter The First Number ");
				int x = sc.nextInt();
			System.out.println("Enter The Second Number ");
			 	int y = sc.nextInt();
			 System.out.println("The Product is "+x/y);
		}
		catch(Exception e)
		{
			System.out.println("The Exception is "+e);
		}
	}
	public void Question2()throws Exception
	{
//		Write a java program that prints "HaHa" during Arithmetic exception and "HeHe" during an Illegal argument exception.
		try
		{
			System.out.println("Enter your Name");
			 	String n;
				n = sc.next();
//			 i am making my own exception
			if(n=="Ujjwal")
			{
				throw IllegalArgumentException;
			}
			System.out.println("Enter The First Number ");
			int x = sc.nextInt();
		System.out.println("Enter The Second Number ");
		 	int y = sc.nextInt();
		 System.out.println("The Product is "+x/y);
		}
		catch(ArithmeticException a)
		{
			System.out.println("There has been an error due to \"HAHA\" "+a);
		}
		}
	}
public class Questions 
{
	public static void main(String[] args) throws Exception 
	{
		question1 q1 = new question1();
		q1.Question1();
		try
		{
			q1.Question2();
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("There has been an error due to \"HEHE\" "+e);
		}
	}
}
