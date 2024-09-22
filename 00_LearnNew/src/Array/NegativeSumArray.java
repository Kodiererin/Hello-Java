package Array;

public class NegativeSumArray 
{
	public static void main(String[] args) 
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter Size");
		int[] arr = new int[sc.nextInt()];
		System.out.println("Enter Elements");		
		for(int i=0 ; i<arr.length ; i++)
		{
			arr[i] = sc.nextInt();
		}
		
	}
}
