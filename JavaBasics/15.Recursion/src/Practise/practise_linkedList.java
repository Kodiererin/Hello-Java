//	Linked List + Recursion + Search has been done
// problem in the program is if the number is not found in the array then the program will run infinitely times...
package Practise;
import java.util.LinkedList;
import java.util.Scanner;

public class practise_linkedList 
{
	public static void main(String[] args) throws Exception
	{
		LinkedList lst = new LinkedList<Integer>();
		System.out.println("Enter The Array Elements");
		Scanner sc = new Scanner(System.in);
		int x = 1;
		do
		{
			x = sc.nextInt();
			lst.add(x);
		}while(x!=0);
		System.out.println(lst);
		System.out.println("Enter The Array That you want to search ");
		int search = sc.nextInt();
		if(practise_linkedList.search(search ,0 , lst)==-1)
		{
			System.out.println("The Array is Not Found");
		}
		else
		{
			System.out.println("The Array has been found "+practise_linkedList.search(search , 0 , lst));
		}
		
	}
	public static int search(int search ,int index , LinkedList lst)
	{
		if(lst.contains(search)==true)
		{
			return lst.indexOf(search);
		}
		
		search(search, index++, lst );
		return -1;
	}
}
