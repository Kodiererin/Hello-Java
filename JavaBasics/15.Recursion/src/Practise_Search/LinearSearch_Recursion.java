package Practise_Search;

import java.util.Scanner;

public class LinearSearch_Recursion 
{
	public static int search(int index , int search , int...is) throws Exception
	{
		if(index<is.length)
		{
			if(search==is[index])
			{
				return index;
			}
			else
				search(index++ , search , is);
		}
		return -1;
	}
	public static void main(String[] args) throws Exception 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size of the Array ");
		int [] arr = new int[sc.nextInt()];
		System.out.println("Enter The Elements in the array ");
		for(int i=0 ; i<arr.length ; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter The Element that you want to search");
			int search = sc.nextInt();
		int x = search(0,search,arr);
		if(x!=-1)
			System.out.println("The Array is in index Number "+x);
		else
			System.out.println("The Array not found");
		sc.close();
	}
}
