// Ye copied h, sharanm kr sale kch toh original kr
import java.util.*;
class Recursion_FibonacciSeries
{
	static int x=0 , y=1 , z=0;
	static void printkriskojldi(int count)
	{
		if(count>0)
		{
			z=x+y;
			x=y;
			y=z;
			System.out.print(" , "+z);
			printkriskojldi(count-1);
		}
	}
	public static void main(String[] args)
	{
		int count = 10;
		System.out.print(x+" , "+y);
		printkriskojldi(count-2);
	}
}