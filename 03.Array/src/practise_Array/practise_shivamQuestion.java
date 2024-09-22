//	Arrange the Following
//	2  1 -1  3 -2 -7 -6
//	2  1  3  6 -1 -2 -7
package practise_Array;

import java.util.Scanner;

public class practise_shivamQuestion 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size of the Array");
		int[] arr = new int[sc.nextInt()];
		System.out.println("Enter The Elements of the Array");
		for(int i=0 ; i<arr.length ; i++)
		{
			arr[i] = sc.nextInt();
		}
		sc.close();
		for(int j=0 ; j<arr.length ; j++)
		{
			if(arr[j]<0)
			{
				for(int k=j ; k<arr.length ; k++)
				{
					if(arr[k]>=0)
					{
						int temp=arr[k];
						arr[k] = arr[j];
						arr[j] = temp;
					}
				}
			}
		}
//		searching the negative no array index.
		int negIndex=0;
		for(int l=negIndex ; l<arr.length ; l++)
		{
			if(arr[negIndex]<0)
			{
				negIndex=l;
				break;
			}
		}
//		now for arranging the negative elements in the array
		for(int m = negIndex ; m<arr.length ; m++)
		{
			for(int n = negIndex ; n<arr.length ; n++)
			{
				if(arr[m]>=arr[n])
				{
					int temp = arr[n];
					arr[n] = arr[m];
					arr[m] = temp;
				}
			}
		}
//		loop for output
		for(int out=0 ; out<arr.length ; out++)
		{
			System.out.println(arr[out]);
		}
	}
}