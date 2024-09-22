import java.util.*;
@SuppressWarnings("serial")
class info_throw_throws
{
	info_throw_throws()
	{
		System.out.println("1. Throw Keyword ");
		System.out.println("   1. Overall Throw kwyword is used to throw an exception which is either is predefined or a custom exception that is made by the user");
		System.out.println("2. Throws Keyword");
		System.out.println("   1. Throws keyword is used to declare the exception. this gives an information to declare the programmer that there might be an exception, so it is better to be prepared with a try-catch block");
		System.out.println("   2. Remember JAVA uses Throws keyword in method declaration only!");
	}
}
@SuppressWarnings("serial")
class NegativeRadius extends Exception
{
	public String toString()
	{
		return "Radius cannot be Negative ";
	}
	public String getMessage()
	{
		return "Radius Negative nhi hoga";
	}
}
public class concept_throw_throws 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) throws NegativeRadius 
	{
		info_throw_throws info = new info_throw_throws();
		System.out.println("______________________________________________________________________________");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Radius of the circle ");
		int radius = sc.nextInt();
		try
		{
			if(radius<0)
			{
				throw new NegativeRadius();			// new keyword is used. So Be careful!
			}
			System.out.println("The Radius of the Circle "+(Math.PI*radius*radius));			
		}
		catch(Exception e)
		{
			System.out.println("Exception "+e.toString());
			System.out.println(e.getMessage());
//			System.out.println(e.);
		}
		sc.close();
	}
}
