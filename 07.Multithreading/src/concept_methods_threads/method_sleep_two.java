package concept_methods_threads;
import java.io.*;
import java.lang.*;
public class method_sleep_two extends Thread 
{
	public static void main(String[] args)
	{
		try 
		{
			for(int i=1 ; i<=5 ; i++)
			{
				Thread.sleep(2000);
				System.out.println("After Two Seconds"+i); //In the above example, the main() method will be put to sleep for 2 seconds every time the for loop executes.
			}
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
}
