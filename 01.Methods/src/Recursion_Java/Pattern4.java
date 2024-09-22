package Recursion_Java;
import java.util.*;
public class Pattern4 
{
	static void column(int x , int y , int space)
	{
		if(y<=x)
		{
			space(x-1 , space);
			row((2*y)+1 , 1);
			System.out.println();
			column(x,y+1 , space+1);
		}
		else
		{
			return;
		}
	}
	static void space(int x , int y)
	{
		if(y<=x)
		{
			System.out.print(" ");
			space(x , y+1);
		}
		if(x==0)
		{
			return;
		}
		else
		{
			return;
		}
	}
	static void row(int x , int y)
	{
		if(y<=x)
		{
			System.out.print("x");
			row(x , y+1);
		}
		else
			return;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Numer of Columns you want to get ");
			int x = sc.nextInt();
		column(x,0 ,0);
	}
}
