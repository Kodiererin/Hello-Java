package Practise;

import java.util.Scanner;

public class practise_sortArray 
{
	public static void main(String[] args) 
	{
		System.out.println("Program To Sort the Array ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the Array");
		int size = sc.nextInt();
		int [] arr = new int[size];
		System.out.println("Enter The Elements in the Array");
		for(int i=0 ; i<size ; i++)
		{
			arr[i] = sc.nextInt();
		}
		sc.close();
		int [] arr1 = new int[size];
		arr1 = practise_sortArray.sortArray(0, arr);
		for(int i=0 ; i<size ; i++)
		{
			System.out.println(arr1[i]);
		}
	}
	public static int[] sortArray(int index , int...is)
	{
		if(index == is.length-1)
		{
			return is;
		}
		if(is[index]<is[index+1])
		{
			int temp = is[index+1];
			is[index+1]=is[index];
			is[index] = temp;
			sortArray(index+1,is);
		}
		if(is[index]>=is[index+1])
		{
			sortArray(index+1,is);
		}
		return is;
	}
}
