//buuble sort - ascennding order
import java.util.*;
class Ascending_Order
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Array Size");
			int x = sc.nextInt();
		int [] hello = new int[x]; 
		for(int i=0 ; i<x ;  i++)
		{
			hello[i] = sc.nextInt();
		}
		for(int j = 1 ; j<x-1 ; j++)
		{
				if(hello[j]>=hello[j+1])
				{
					hello[j] = hello[j] + hello[j+1];
					hello[j] = hello[j+1] - hello[j];
					hello[j+1] = hello[j+1] - hello[j];
				}		
			}
			
		
		for(int m=0 ; m<x ; m++)
		{
			System.out.println(hello[m]);
		}
	}
}