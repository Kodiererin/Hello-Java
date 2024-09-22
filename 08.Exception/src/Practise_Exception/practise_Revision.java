package Practise_Exception;

import java.util.Scanner;

//creating an exception class for further use
class myClass extends Exception
{
	public String toString()
	{
		return "Kanpur me apka swagat h";
	}
	public String getMessage()
	{
		return "Swagat nhi kroge Hamara";
	}
}
public class practise_Revision
{
	static void compute() throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		if(x<0)
		{
			try
			{
//				int[] arr = new int[x];
//				System.out.println("Length of the Array is "+arr.length);
				throw new myClass();
			}
			catch(myClass e)
			{
				System.out.println(e.getMessage());
				System.out.println(e.toString());
			}
		}
		int[] arr = new int[x];
		System.out.println("Length of the Array is "+arr.length);
		
		
	}
	public static void main(String[] args) throws Exception 
	{
		System.out.println("Practise Exception ");
		compute();
	}
}