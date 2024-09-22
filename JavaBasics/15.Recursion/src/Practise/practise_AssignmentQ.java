//	Write a recursive method in Java to return the greatest common divisor(gcd) of two integers 
//	m and n, given that in general, gcd(m,n)=gcd(n, m mod n).


package Practise;

import java.util.Scanner;

public class practise_AssignmentQ 
{
//	this was the prototype given by the teacher to do in the assignment
	static double GCD(double x , double y)
	{
		if(y<=0)
		{
			return x;
		}
		return GCD(y,x%y);
	}
//	another methods on the way...
//	doing by EUCLIDEAN ALGORITHM
	static void gcd_Euclidean(int x , int y ) throws Exception
	{
		try
		{
			if(y<=1)
			{
				System.out.println(x+" mod "+y+" = "+x/y+" mod "+(x-(y*(x/y))));
				System.out.println("Greatest Common Factror is "+y);
				return;
			}
			System.out.println(x+" mod "+y+" = "+x/y+" mod "+(x-(y*(x/y))));
			gcd_Euclidean(y,x%y);
		}
		catch(Exception e)
		{
			System.out.println("The GCD between the TWO numbers is "+x+" "+y+" is "+x);
		}
	}
	public static void main(String[] args) throws Exception 
	{
		System.out.println("Hello Mitroooo");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two numbers that you want to find out the GCD");
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println("The GCD of "+x+" "+y+" is "+(int)GCD(x,y));
		System.out.println("GCD by Euclidean ALgorithm ");
		gcd_Euclidean(x,y);
		
//		finding GCD by LCM from findLCM class.
//		GCD(x,y) = (x*y)/LCM(x,y)
		System.out.println("LCM of "+x+" "+y+" is "+findLCM.compute(x, y, 2, 1));
		System.out.println("Formula = GCD(x,y) = (x*y)/LCM(x,y)");
		System.out.println("The GCD of "+x+" "+y+" is "+(x*y)/findLCM.compute(x, y, 2, 1));
	}
}
