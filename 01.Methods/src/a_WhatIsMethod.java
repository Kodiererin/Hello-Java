//We are creating a static method to understand its functions features and grab concept from it
import java.util.*;
class a_WhatIsMethod 
{
	static int ujjwal(int x , int y)
	{
		int z ;
		if(x>y)
		{
			z = x-y;
		}
		else
		{
			z = y-x;
		}
		return z;
	}
//	yha pe hm ek aur bna rhe h static method try krne ke  liye
//	ki chalta h ki nhi
	static boolean kumar(int a , int b)
	{
		boolean mamu;
		if(a == b)
		{
			mamu = true;
		}
		else
		{
			mamu = false;
		}
		return mamu;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A Number ");
			int a = sc.nextInt();
		System.out.print("Enter A Number ");
			int b = sc.nextInt();
			int sum = ujjwal(a,b);
			int sum2;
		System.out.println("Check if the number are same of not "+kumar(a,b));
		sum2 = ujjwal(a,b);
//		int a = 9;
//		int b = 10;
//		int c = ujjwal(a,b);
		System.out.println("Substracted Result ="+sum+" and The substracted sum2 = "+sum2);
		
	}
	
}
