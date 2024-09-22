package Practise;
import java.util.*;
public class practise_SQUARE 
{
	public static void print1(int row , int column)
	{
		if(column==0)
		{
			return;
		}
		print2(row,column);
		System.out.println();
		print1(row,column-1);
	}
	public static void print2(int row , int column)
	{
		if(row<=0)
		{
			return;
		}
		System.out.print("* ");
		print2(row-1,column);
	}
	public static void main(String[] args) 
	{
		print1(5,5);
	}
}
