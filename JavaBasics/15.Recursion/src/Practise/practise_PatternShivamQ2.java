//	*****
//	 ****
//	  ***
//	   **
//	    *
//	   **
//	  ***
//	 ****
//	*****

//	Line 75 to 79 dekh lena, boht hi mast concept + magic tarika h jisse aap badal skte ho!

//	Setting Up a Parameter - Tum Index ko badha rhe ho!...
package Practise;

import java.util.Scanner;

public class practise_PatternShivamQ2 
{
	static void column(int index , int max)
	{
//		just Imagine column(1,5)
		if(index<=max)
		{
			space1(0,index);
			row(max-index);
			System.out.println();
			column(index+1,max);			
		}
		if(index>=max)
		{
//			column2(0,max);
			return;
		}
	}
	static void space1(int index , int max)
	{
		if(index<=max)
		{
			System.out.print(" ");
			space1(index+1,max);
		}
		if(index>max)
		{
			return;
//			System.out.println();
		}
	}
	static void row(int max)
	{
		if(max>=0)
		{
			System.out.print("*");
			row(max-1);
		}
		if(max<=0)
		{
			return;
		}
	}
//	methods for the second half
	static void column2(int index , int max)
	{
		if(index<=max)
		{
			space2(max-index);
			row2(index);
			System.out.println();
			column2(index+1,max);
		}
		if(index>=max)
		{
			return;
		}
	}
	static void row2(int max)
	{
		if(max>=0)
		{
			System.out.print("x");
//			lets do a cheed chadh
//			System.out.print("x ");
//			System.out.print(" x");
//			System.out.print(" xx ");
			row2(max-1);
		}
		if(max<=0)
		{
			return;
		}
	}
	static void space2(int max)
	{
		if(max>=0)
		{
			System.out.print(" ");
			space2(max-1);
		}
		if(max<=0)
		{
			return;
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("Toh kaise H aap log! Chaliye Shuru Krte h");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number of Rows = Columns That You want to print ");
		int rolumn = sc.nextInt();
		sc.close();
		column(1,rolumn);
		column2(1,rolumn);
	}
}
