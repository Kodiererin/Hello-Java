package a_DSA_With_CollectionFramework;
import java.util.Arrays;
public class CF_18_Arrays_and_Comparator
{
	public static void main(String[] args)
	{
		int a[] = {1,3,5,7,9};
		int b[] = {2,4,6,8,10};

//		System.out.println(Arrays.compare(a,b));
//		a>b = -1 | a<b = 1 | a=b 0

//		int c[] = Arrays.copyOf(a, 4);		// creates a copy of array
//		for(int i=0 ; i<c.length ; i++)
//		{
//			System.out.println(c[i]);
//		}

//		Arrays.fill(c, 10);
//		for(int i=0 ; i<c.length ; i++)
//		{
//			System.out.println(c[i]);
//		}

		int d[] = {2,12,32,2,123,13,43,5};
		Arrays.parallelSort(d);
//		for(int i=0 ; i<d.length ; i++)
//		{
//			System.out.println(d[i]);
//		}

//		i_Sorting the Array
		int e[] = {2,31,22,43,43,65,23};
		Arrays.sort(e);
//		for(int i=0 ; i<e.length ; i++)
//		{
//			System.out.println(e[i]);
//		}
//		Applying Binary Search
//		System.out.println("Binary Search");
//		System.out.println(Arrays.binarySearch(e, 23));
//		System.out.println(Arrays.binarySearch(e, 1));


//		Lets use the Wrapper class and see what happens.

		String[] m = {"Ujjwal","Kumar","UjjKuma","India","Zebra"};
		Arrays.sort(m);
		for (String element : m) {
			System.out.println(element);
		}




	}
}
