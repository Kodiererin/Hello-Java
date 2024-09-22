//Note : Many of the recursion programs has been made in the loop folder so please do check
package Concept;

import java.util.Scanner;

public class concept_01 
{
//	ye tmhara int datatype se print krna hua...
	public static int printDecreasing1(int n)
	{
		System.out.println(n);
		if(n==0)
			return 0;
		return printDecreasing1(n-1);
	}
	public static void printDecreasing2(int x)
	{
		if(x==0)
			return;
		System.out.println(x);
		printDecreasing2(x-1);
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number ");
		int x = sc.nextInt();
		printDecreasing1(x);
		
//		printing by different method
		printDecreasing2(x);
	}
}
