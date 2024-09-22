package Concept;

import java.util.Scanner;

public class concept_02 
{
	public static void printMystack(int n)
	{
		if(n==0)
		{
			return;
		}
		printMystack(n-1);	// bhale hi ye function wapas jaa rha h lekin dhyan dena ki aate wakt ye print krega!
		System.out.println(n);	// ye concept recursion ka dhyan me rakhna
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number That you want to print by This method");
		int x = sc.nextInt();
		sc.close();
		printMystack(x);
	}
}
