//	Arrange the Following
//	2  1 -1  3 -2 -7 -6
//	2  1  3  6 -1 -2 -7
//----------------- By Using Recursion-----------------
package Practise;

import java.util.Scanner;

public class practise_shivamQuestion 
{
	static void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the Array");
		int[] arr = new int[sc.nextInt()];
		for(int i=0 ; i<arr.length ; i++)
		{
			arr[i] = sc.nextInt();
		}
		sc.close();
//		show(0,arr);
		arrangeArray(0, 0, arr);
		return;
	}
	static void arrangeArray(int index, int power , int...is)
	{
		if(index<is.length)
		{
			if(is[index]<0)
			{
				if(power<is.length)
				{
					if(is[power]>=0)
					{
						int temp = is[power];
						is[power] = is[index];
						is[index]=temp;
						arrangeArray(index+1,0,is);
					}
					if(is[power]<0)
					{
						arrangeArray(index,power+1,is);
					}
					if(power>=is.length)
					{
						arrangeArray(index,power+1,is);
					}
				}
				if(power>=is.length)
				{
					arrangeArray(index+1,0,is);
				}
			}
			if(is[index]>=0)
			{
				arrangeArray(index+1,power,is);
			}
		}
		if(index>=is.length)
		{
			show(0,is);
		}
	}
//	arranging the negative array	
	static void arrangeArray(int index, int...is)
	{
		if(index<is.length)
		{
			if(index<is.length-1)
			{
				if(is[index]<0)
				{
					if(is[index]>is[index+1])
					{
						int temp = is[index];
						is[index] = is[index+1];
						is[index+1] = temp;
					}
				}
			}
		}
		show(0,is);
	}
	static void show(int index,int...is)
	{
		if(index<is.length)
		{
			System.out.println(is[index]);
			show(index+1,is);
		}
		if(index>=is.length)
		{
			System.out.println("-------------------------");
			return;
		}
	}
	public static void main(String[] args) 
	{
		input();
	}
}