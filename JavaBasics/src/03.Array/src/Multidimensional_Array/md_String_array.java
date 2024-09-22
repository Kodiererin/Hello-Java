package Multidimensional_Array;

import java.util.Scanner;

public class md_String_array 
{
	public static void class01show(String data[][])
	{
		for(int i=0 ; i<data.length ; i++)
		{
			for(int j=0 ; j<data[0].length ; j++)
			{
				System.out.print(data[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("WELCOME UJJWAL KEM CHO");
		System.out.println("Enter The data of the array");
		String[][] myClass = new String[sc.nextInt()][sc.nextInt()];
		System.out.println("Enter The Data ");
		for(int i=0 ; i<myClass.length ; i++)
		{
			for(int j=0 ; j<myClass[i].length ; j++)
			{
				myClass[i][j] = sc.nextLine();
			}
		}
		class01show(myClass);
	}
}
