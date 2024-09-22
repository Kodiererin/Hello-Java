//Write a Java program to find the maximum element in a Java array.
//Code with Harry
//Get Set Code
import java.util.*;
public class CWH7_MAXIMUMARRAY_BYINDICES 
{
	public static void main(String[] args)
	{
		System.out.println("Maximum Array");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] num = new int[n]; 
		for(int i=0 ; i<num.length ; i++)
		{
			num[i] = sc.nextInt();
		}
		System.out.println("The Maximum Array = "+num[(num.length-1)]+" and the maximum array is "+(num.length-1));
	}

}
