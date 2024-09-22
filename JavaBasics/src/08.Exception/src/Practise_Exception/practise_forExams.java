package Practise_Exception;

class NegativeRadius extends Exception
{
	NegativeRadius()
	{
		System.out.println("The Radius cannot be Negative");
	}
}
public class practise_forExams 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello Mota Bhai");
		System.out.println("Enter Radius");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int r = sc.nextInt();
		try
		{
			if(r<0)
				throw new NegativeRadius() ;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
