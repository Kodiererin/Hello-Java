import java.util.*;
class Test8
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Array size");
		int size = sc.nextInt();		
		int [] hello = new int[size];
		System.out.println("Enter the Array you Want to arrance in ascending order");
		for(int i=0 ; i<size ; i++)
		{
			hello[i] = sc.nextInt();
		}
//		we will go in ascending order
		for(int i=0 ; i<(size-1) ; i++)
		{
			if(hello[i]>=hello[i+1])
			{
				hello[i] = hello[i+1];
			}
			else
			{
				hello[i] = hello[i];
			}
		}
for(int j=0 ; j<(hello.length) ; j++)
{
	System.out.print(hello[j]+" , ");
}
		}
	}
