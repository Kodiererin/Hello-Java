package i_Sorting;

public class f_InsertionSort
{
	public static void main(String[] args)
	{
		int[] arr = {3,12,4,2,13,10};



		for(int i=1 ; i<arr.length ; i++)
		{
			int key = arr[i];
			int j=i-1;
			while(j>-1 && arr[j]>key)
			{
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
		for (int element : arr) {
			System.out.println(element);
		}
		System.out.println("-------------------------------------------");
		myCode();
	}
	public static void myCode()
	{
		int arr[] = {3,12,4,2,13,10};

		for(int i=1 ; i<arr.length ; i++)
		{
			int check = arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>check)
			{
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = check;
		}

		for (int element : arr) {
			System.out.println(element);
		}
	}
	public static void info()
	{
		System.out.println("Best Case : Already Sorted");
		System.out.println("[10,20,30,40,50] -> BigTheta(n)  You will go inside the while loop because previous key is already smaller than the Current Key");
		System.out.println("[50.40,30,20,10] -> BigTheta(n^2) You will be doing maximum Shifting ");
		System.out.println("In General The time compleity of the sorting algorithem is O(n^2) ");
	}
}

