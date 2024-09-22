import java.util.Scanner;

// A sample Program to show the Java Docs Concept
/**
 * 
 * @author UJJWAL KUMAR
 * @author Java Jdk LatestVersion
 * @since 2021
 * @See ~ Please refer to original documentation for more info.
 * {@summary So UJJWAL You can do it. just focus and do it!}
 */

class sampleClass
{
/**
 * 
 * @param x x datatype is Integer
 * @param y	y datatype is Integer
 * @return 	This method returns sum of two numbers.
 * @throws an Exception is thrown if the x or y is 0.
 * 
 */
	public void add(int x , int y) throws Exception
	{
		try
		{
			if(x==0 || y==0)
			{
				throw new Exception();
			}
			else
				System.out.println("The Sum of Two numbers is "+(x+y));
		}
		catch(Exception e)
		{
			System.out.println("X and Y must not be 0");
		}
	}
}
public class concept_JavaDocs 
{
	public static void main(String[] args) throws Exception 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Number ");
		 	int x = sc.nextInt();
		 System.out.println("Enter Second Number ");
		  	int y = sc.nextInt();
		  sampleClass sclass = new sampleClass();
		  sclass.add(x, y);
		  sc.close();
	}
}
