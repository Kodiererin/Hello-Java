import java.util.*;
public class Average_of_N_Numbers 
{
	public static int averagekro(int ...arr) // yha pe array input ho rha h!
	{
		int result = 0;
		for(int i=0 ; i<arr.length ; i++)	// loop
		{
			result = arr[i] + result;
		}
		result = result/arr.length;
		return result;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number numbers you want to get the average");
			int n = sc.nextInt();
		int [] meraarray = new int[n]; 
		for(int i=0 ; i<n ; i++)
		{
			meraarray[i] = sc.nextInt();
		}
		System.out.println("The Average of the Array is "+averagekro(meraarray));
	}

}
