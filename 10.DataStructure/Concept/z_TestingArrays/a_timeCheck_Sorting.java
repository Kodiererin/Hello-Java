package z_TestingArrays;

import java.math.BigInteger;

public class a_timeCheck_Sorting
{
	public static void checkTimeInsertionSort()
	{
//		Taking variables for checking Time.
		int[] arr = new int[10000];
		BigInteger x,y;
		for(int i=0 ; i<arr.length ; i++)
			arr[i] = (int)(Math.random()*1000)+1;
		x = BigInteger.valueOf(System.currentTimeMillis());
//		Insetion Sort Begins
		for(int i=1 ; i<arr.length ; i++)
		{
			int replace = arr[i];
			int j = i-1;
			while(j>=0 && arr[j]>replace)
			{
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = replace;
		}
		y = BigInteger.valueOf(System.currentTimeMillis());
		System.out.println("The Time Taken is "+y.subtract(x));
		for (int element : arr) {
			System.out.println(element);
		}

	}
	public static void main(String[] args)
	{
		checkTimeInsertionSort();
	}
}
