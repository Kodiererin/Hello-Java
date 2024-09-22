package i_Sorting;

import java.util.Arrays;
import java.util.Comparator;

public class d_Sorting_nonPrimitiveType_Method3_WrapperClass
{
	public static void main(String[] args)
	{
		Integer[] arr = {5,20,10,12};
//		Arrays.sort(arr,Collections.reverseOrder());			// ascending -> Descending
		Arrays.sort(arr);										// Descending -> Ascending
		System.out.println(Arrays.toString(arr));
	}
}
//	Write a program that sorts an Integer in such a way that all even Numbers comes first then all odd number appear.

class myCMP implements Comparator<Integer>
{

	@Override
	public int compare(Integer o1, Integer o2)
	{
		// TODO Auto-generated method stub
		return o1%2-o2%2;
	}
}

class SortEvenOdd
{
	public static void compute()
	{
		Integer arr[] = {5,20,10,3,12};
		Arrays.sort(arr , new myCMP());
		System.out.println(Arrays.toString(arr));
	}
}
//	If we are sorting non-primitive then the i_Sorting is Stable. (Algorithm used Merge Sort)
//	but if we are sorting Primitive type then the sorting is Unstable (Algorithm used  - Dual pivot sort)

//	If we create a non primitive type then we can do sorting in any way.