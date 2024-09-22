package i_Sorting;

import java.util.Collections;

public class g_Selection_Sort
{
	public static void main(String[] args)
	{
		int[] arr = new int[10];
		for(int i=0 ; i<arr.length; i++)
		{
			arr[i] = (int)(Math.random()*arr.length)+1;
		}
//		System.out.println("Elements Before i_Sorting");
		sortEfficient(arr);								// zaada Changes Nhi H bs Chota-Mota changes hai.
		sortNaive(arr);
	}
//	Efficient Way.
	public static void sortEfficient(int[] arr)
	{
		for(int i=0 ; i<arr.length-1 ; i++)
		{
			int minIndex = i;
			for(int j = i+1 ; j<arr.length ; j++)
			{
				if(arr[j] <arr[minIndex])
					minIndex = j;
			}
//			Only in Swapping we donot take any Extra Arrays.
			arr[minIndex] = arr[minIndex]+arr[i];
			arr[i] = arr[minIndex] - arr[i];
			arr[minIndex] = arr[minIndex]-arr[i];
		}
	}
//	Naive Method
//	Bubble sorting ka concept use hua h lekin yha pe hm Index se khel rhe honge.
	public static void sortNaive(int[] arr)
	{
		for(int i=0 ; i<arr.length ; i++)
		{
			int minIndex = i;
			for(int j=i+1 ; j<arr.length ; j++)
			{
				if(arr[minIndex]>arr[j])
					minIndex = j;
			}
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
		for (int element : arr)
			System.out.println(element);
	}
	public static void info()
	{
		System.out.println("1. One of the Basics Algorithm.");
		System.out.println("2 Camparison based Algoritm and has BigTheta(n^2) time in all cases.");
		System.out.println("3. Good Part : It does less memory write than compaed to Quick Sort, Merge Sort , Insertion Sort etc");
		System.out.println("4. Both Cycle SOrt is optimal in terms of Memory Writes");
		System.out.println("5. BigTheta(n^2) Algorithm ");
		System.out.println("6. Memory write is costly in EEP rom as it reduces this momory. SO in this situation we can use Selection Sort");
		System.out.println("7. It is the Basic Idea idea of Heap Sort");
		System.out.println("8. Selection sort is not stable because order of elements may change ");
		System.out.println("9. It is inplace Algorithm, doesnot require extra memory for i_Sorting");
		System.out.println("10. ");
	}
}
