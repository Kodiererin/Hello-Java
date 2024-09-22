//code with harry
//Write a Java program to find the maximum element in an array.
import java.util.*;
class CWH6_MAXIMUM_ARRAY
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Find the Maximum Array");
		System.out.println("Enter the Length of Array");
			int x = sc.nextInt();
		int [] num = new int[x];
		System.out.println("Enter the Numbers of The Array ");
		for(int i=0 ; i<num.length ; i++) // to take input from the user
		{
			num[i] = sc.nextInt();
		}
		for(int j=0 ; j<num.length ; j++)
		{
			for(int k=0 ; k<j ; k++)
			{
				if(num[j]<num[k])
				{
					num[k] = num[j]; 
				}
			}
		}
		for(int l = (num.length-1) ; l<num.length ; l++) // output
		{
			System.out.print(num[l]+" ");
		}
	}
}