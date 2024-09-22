package Recursion_Java;
import java.util.*;
public class Pattern2 
{
	static void showrow(int x , int y)
	{
		if(x<=y)
		{
			System.out.print("x ");
			showrow(x+1 , y);
		}
		else
		{
			
			return;
		}
	}
	static void showcolumn(int y)
	{
		if(y<=5)
		{
			showrow(1,y);
			System.out.println();
			showcolumn(y+1);
		}
		else
		{
			return;
		}
	}
//	method has been created for adding spaces!
	static void space(int x)
	{
		if(x<=5)
		{
			System.out.print(" ");
			space(x+1);
		}
		else
		{
			return;
		}
	}
	public static void main(String[] args)
	{
		showcolumn(1);
		
	}
}
