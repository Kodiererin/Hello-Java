package Recursion_Java;
import java.util.*;
public class Recursion_Euclidean_Algorithm 
{
	static void Test01(int x , int y)
	{
		if(x==0 || y==0)
		{
			System.out.println("The GCD of two Numbers "+0);
			return;
		}
		if(x>y)
		{	
			int quotient  = x/y;
			int remainder = x%y;
			x = y;
			y = remainder;
			if(y==0)
			{
				System.out.println("The GCD of two Numbers "+x);
				return;
			}
			Test01(x,y);
		}
		else
		{
			int quotient  = y/x;
			int remainder = y%x;
			y= x;
			x = remainder;
			if(x==0)
			{
				System.out.println("The GCD of two Numbers "+y);
				return;
			}
			Test01(x,y);
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers that you want to find the GCD of ");
			int x = sc.nextInt();
			int y = sc.nextInt();
		Test01(x , y);
	}
}
