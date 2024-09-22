//Write a Java program to find the maximum element in a Java array.
//Code With Harry
//Get Set Code
import java.util.*;
public class CWH8_ArrayIs_Sorted_Or_Not 
{
	public static void main(String[] args) 
	{
		System.out.println("The Array is Sorted or Not ");
		System.out.println("Enter the Size of the Array ");
			Scanner sc = new Scanner(System.in);
			int x = sc.nextInt();
		int [] num = new int[x];
		int [] num1 = new int[x];
		System.out.println("Enter the Number in the Array ");
		for(int j=0 ; j<num.length ; j++)
		{
			num[j] = sc.nextInt(); // to be continued 
			num1[j] = num[j];
		}
		int c;
		for(int m=0 ; m<(num.length) ; m++) // saara elements lena h
		{
			for(int n=0 ; n<m ; n++) // ye sorting hone wala h! 
			{
				if(num[m]<=num[n])
				{
					num[n] = num[n] + num[m];
					num[m] = num[n] - num[m];
					num[n] = num[n] - num[m];
				}
			}
		}int ctr =0 ;
		for(int z=0 ; z<num.length ; z++)
		{
			if(num1[z]!= num[z])
			{
				ctr++;
			}
		}
		if(ctr>0)
		{
			System.out.println("The array is not sorted ");
		}
		System.out.println();
		System.out.println("The given array is = ");
		for(int xx = 0 ; xx<num1.length ; xx++)
		{
			System.out.print(num1[xx]+" , ");
		}
		System.out.println();
		System.out.println();
		System.out.println("The Sorted Array must be = ");
		System.out.print("Sorted Array");
		{
			for(int i=0 ; i<num.length ; i++)
			{
				System.out.print(num[i]+" , ");
			}
		}

	}

}