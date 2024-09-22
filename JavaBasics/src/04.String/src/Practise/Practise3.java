package Practise;

import java.util.Scanner;

public class Practise3 
{
	public static void getSmallestAndLargest(String s , int k) 
	{
		try
		{
			String initial = "";
			for(int i=0 ; i<k ; i++)
			{
				initial = initial+"a";
			}
			String [] sArray = new String[s.length()];
			int i=0;
			while(i<s.length()-1)
			{
				sArray[i] = s.substring(i, k-i);
				i++;
			}
			int [] intArray = new int[s.length()];
			int j=0;
			while(j<s.length())
			{
				intArray[j] = sArray[j].compareTo(initial);
				System.out.println(intArray[j]);
				j++;
			}
		}
		catch(Exception e)
		{
			System.out.println("AN Exception exist.");
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
//		String name = sc.nextLine();
//		int x = sc.nextInt();
		sc.close();
		getSmallestAndLargest("UjjwalKumar" , 3);
	};
}