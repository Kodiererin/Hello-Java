package i_Sorting;
import java.util.Arrays;

public class b_ArraysSort
{
	public static void main(String[] args)
	{
//		Arrays.sort is used to sort Normal Arrays.
		int[] arr = {1,32,12,43,2,12};
		char[] arr2 = {'a','q','e','r','q','r','2'};
		Arrays.sort(arr);
		Arrays.sort(arr2);

		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));

		experiment e = new experiment();
	}
}

//	Arrays.sort doses not allow comparator to change the natural order for primitive Datatype.
//	But when we are using user defined class as objects then we can add the comparator to modify the i_Sorting.
//	As By default Arrays.sort() sorts from ascending to descending.
//	Same goes for Collection.sort();

//	Arrays.sort has some more versions also which we can use the,

class experiment
{
	experiment()
	{
		int[] arr = {1,32,12,43,2,12};
		char[] arr2 = {'a','q','e','r','q','r','2'};

		Arrays.sort(arr,1,4);						// sorts the particular indexed array
		System.out.println(Arrays.toString(arr));
	}
}

//	by Default array sorts the array form 0 to n-1 but we can modify the array to sort a particular index also.

