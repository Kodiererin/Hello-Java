package DiscreteMathematics;

import java.util.Scanner;

class sortIt
{
	public static void sort(int ...arr)
	{
		int x = arr.length;
		int temp;
		int ctr=0;
		for(int i=0 ; i<x ; i++)
		{
			for(int j=0 ; j<=x-1 ; j++)
			{
				if(arr[j]<=arr[i]) 
				{
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
					ctr++;
				}
			}
		}
		for(int j=0 ; j<x ; j++)
		{
			System.out.println(arr[j]);
		}
		System.out.println("Number of Steps Made = "+ctr);
	}
}
public class BubbleSort {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Elements");
			int x = sc.nextInt();
		int [] number = new int[x];
		for(int i=0 ; i<x ; i++)
		{
			number[i] = sc.nextInt();
		}
		sortIt.sort(number);
		
	}
}
