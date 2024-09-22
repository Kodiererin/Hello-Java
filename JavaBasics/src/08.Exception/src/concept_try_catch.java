import java.io.*;
public class concept_try_catch 
{
	public static void main(String[] args) 
	{
		int a = 6000;
		int b = 0;
//		here we are going by with two methods,
//		1. If we go without exception then.
//		int c = a/b;
//		System.out.println("The Sum is "+c);
		
//		if we go without try catch block then.
		try
		{
			int c = a/b;
			System.out.println("The Result is "+c);
		}
		catch( Exception e) 
		{
			System.out.println("We failed to get the result , Because " );
			System.out.println(e);
		}//		Finally can or cannot be implemented as wish by the user
		finally
		{
			System.out.println("End of the Program");
		}
		
	}
}
