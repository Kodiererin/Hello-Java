package TestTime;

import java.math.BigInteger;

public class a_CheckSecondsDiff 
{
	public static void main(String[] args) 
	{	
//		Insertion Sort Timing and Bubble Sort Timing.
		int[] arr = {10,21,3,43,12,3,23,45,12};
		BigInteger x = BigInteger.valueOf(System.currentTimeMillis());
		for(int i=0 ; i<arr.length-1 ; i++)
		{
			for(int j=i+1 ; j<arr.length ; j++)
				if(arr[i]>arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
		}
		BigInteger y = BigInteger.valueOf(System.currentTimeMillis());
		y = y.subtract(x);
		System.out.println("Time Taken "+(y));
		for(int i=0 ; i<arr.length ; i++)
			System.out.println(arr[i]);
		System.out.println("Time Taken "+(y));
		
	}
}
