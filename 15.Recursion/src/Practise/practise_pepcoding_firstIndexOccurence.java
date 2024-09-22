package Practise;
import java.util.*;
public class practise_pepcoding_firstIndexOccurence
{
	public static void main(String[] args) 
	{
		System.out.println("Welcome Ujjwal Bhai");
		System.out.println("Enter The Size of the Array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		System.out.println("Enter the Elements in the Array");
		int arr[] = new int[size];
		for(int i=0 ; i<size ; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter The Number that you want to find in the array");
			int search = sc.nextInt();
		int x = practise_pepcoding_firstIndexOccurence.searchFirstOcurence(search,0,arr);
		if(x==-1)
		{
			System.out.println("The Array of First Index Occurence Not Found ");
		}
		else
		{
			System.out.println("First Index Occurence Of an Array is Found whose Index is "+searchFirstOcurence(search,0, arr));
		}
		System.out.println();
		sc.close();
	}
	public static int searchFirstOcurence(int search,int index, int...is)
	{
		if(index<is.length)
		{
			if(is[index] == search)
			{
				return index;
			}
			else
			{
				index = index+1;
				searchFirstOcurence(search,index,is);
			}
		}
		if(index>=is.length)
		{
			return -1;
		}
		return searchFirstOcurence(search,index++,is);
	}
}