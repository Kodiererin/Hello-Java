import java.util.*;
import java.io.*;
public class Practise_javaStaticInitializerBlock 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Breadth");
		System.out.println("Enter The height");
		try
		{
			int breadth = sc.nextInt();
			int height = sc.nextInt();
			if(breadth<0 || height<0)
			{
				throw new Exception();
			}
			System.out.println(breadth*height);
		}
		catch(Exception e)
		{
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		}
	}
}
