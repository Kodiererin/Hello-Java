import java.util.Scanner;

@SuppressWarnings("serial")
//	This Program was done my Santosh Sir, so in order to grab the concept I am writing this program
//	creating an user defined Exception
class UjjwalException extends Exception
{
	UjjwalException(String s)
	{
		super(s);
	}
}
class test
{
	void checkAge(int age) throws Exception,UjjwalException   // you either write Exception or UjjwalException or Both
	{
		if(age<18)
		{
			throw new UjjwalException("Age less than 18, not elegible to vote");
		}
		else
		{
			System.out.println("You are Elegible to VOTE");
		}
	}
}
public class concept_myCLassException_SantoshSir 
{
	public static void main(String[] args) 
	{
		test t1 = new test();
		Scanner sc = new Scanner(System.in);
		try
		{
			System.out.println("Enter The Age of the Person");
			t1.checkAge(sc.nextInt());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		sc.close();
	}
}
