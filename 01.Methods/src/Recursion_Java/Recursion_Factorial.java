package Recursion_Java;
import java.util.*;
class Recursion_Factorial
{
	static void factorial(int x , int y)
	{
		if(x==0 || x==1 )
		{
			return;
		}
		if(x%y==0)
		{
			System.out.print(x+" ");
			factorial(x/y , y);
		}
		else
		{
			factorial(x , y+1);
		}
	}
	
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The numbers that you want the factorial of ");
		 	int x = sc.nextInt();
		factorial(x,2);
	}
}