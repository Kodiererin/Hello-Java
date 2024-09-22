
class Kemcho
{
	public static int check(int [] arr , int i , int j)
	{
		if(i!=j)
		{
			int mid = (i+j)/2;
			if(arr[mid]<=arr[mid+1])
			{
				return check(arr,0,mid);
			}
			else
			{
				return check(arr,mid,j);
			}
		}
		else
		{
			return arr[i];
		}
	}
	public static void main(String[] args) 
	{
		int[] arr = {0,3,4,5,6,7,8,5,7,8,9,10};
		System.out.println(arr.length-1);
		System.out.println(check(arr,0,arr.length-1));
	}
}
