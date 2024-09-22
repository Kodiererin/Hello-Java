package TestDSA;

public class test_AlgorithmDesign 
{
//	static int[] arr = {9,6,4,3,2,1,3,4,5,4,6,7,8,10};
//	goal is to find the smallest element in the array
	
	public static void findSmallest()
	{
		int[] arr = {9,6,4,3,2,1, 3,4};
		int i=0;
		int j = arr.length;
		boolean k = true;
		while(k)
		{
			int mid = (i+j)/2;
			int middi = (i+j)/2 +1;
			if(arr[mid]<arr[middi] && middi-mid!=0)
			{
				middi=mid;
				mid=0;
			}
			else if(arr[mid]>arr[middi] && middi-mid!=0)
			{
				mid=middi;
				middi = arr.length-1;
				
			}
			else
			{
				System.out.println(arr[mid]);
				k=false;
			}
		}
	}
	public static void main(String[] args) 
	{
		findSmallest();
	}
	
}
