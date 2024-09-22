
public class testAD 
{
	class Node
	{
		public static void check(int[] arr , int i , int j)
		{
			int mid = (i+j)/2;
			int midP = mid+1;
			if(arr[mid]<arr[midP])
			{
				System.out.println(arr[mid]+" "+arr[midP]);
				check(arr,0,mid);
			}
			else if(arr[mid]>arr[midP])
			{
				System.out.println(arr[mid]+" "+arr[midP]);
				check(arr,midP,j);
			}
			else if(mid==midP)
			{
				System.out.println(arr[mid]);
			}
		}
	}
	public static void main(String[] args) 
	{
//		System.out.println((3+2)/2);
		int[] arr = {9,6,4,3,1,2,3,4,8};
		Node.check(arr,0,8);
	}
}
