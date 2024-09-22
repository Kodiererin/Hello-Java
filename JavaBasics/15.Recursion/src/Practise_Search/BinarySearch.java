//	Binary Search By Recursion
package Practise_Search;
public class BinarySearch 
{
	public static void Binary(int start , int end , int search , int...is)
	{
		{
			int x = start + end;
			x = x/2;
//			System.out.println(x);
			if(search == is[x])
			{
				System.out.println("The Array has Been Found "+x);
				return ;
			}
			if(search>=is[x])
			{
//				System.out.println("Afsos");
				Binary(x,end,search,is);
			}
			if(search<=is[x])
			{
//				System.out.println("Ek Aur Baar afsos");
				Binary(start,x,search,is);
			}
			
//			return -1;
		}
	}
	public static void main(String[] args) 
	{
		int [] arr = {1,2,3,4,5,6,7,8,9};
		int search = 5;
		System.out.println(arr.length);
		Binary(0,arr.length , search , arr);
//		
//		int[] arr1 = {99,78,66,54,34,23,21};
//		int search1 = 66;
//		System.out.println(arr1.length);
//		Binary(0,arr.length , search1 , arr1);
	}
}