package Practise;

import java.util.Scanner;

class practise_pattern_shivam
{
	static void showColumn(int index , int max)
	{
		if(index<=max)
		{
			showRow(0,max);
			System.out.println();
			showColumn(index,max-1);
		}
		if(index>=max)
		{
//			showColumn(index)
			return;
		}
	}
	static void showRow(int index , int max)
	{
		if(index<=max)
		{
			System.out.print(" x ");
			showRow(index+1,max);
		}
		if(index>=max)
		{
			return;
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("Pattern By Recursion");
//		showColumn(0,5);
		System.out.println("Enter The Number of Rows = columns that you want to print");
		Scanner sc = new Scanner(System.in);
		int rolumn = sc.nextInt();
		sc.close();
		showColumn(0,rolumn);
	}
}