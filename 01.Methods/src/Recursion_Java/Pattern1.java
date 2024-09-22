package Recursion_Java;
import java.util.*;
class Pattern1
{
	static void showcolumn(int n , int x)
	{
		if(n<=x)
		{
			showrow(1,n);
			System.out.println();
			showcolumn(n+1 , x);
		}
		else
		{
			return;
		}
	}
	static void showrow(int m , int n)
	{
		if(m<=n)
		{
			System.out.print("x ");
			showrow(m+1 , n);
		}
		else
		{
			return;
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number ");
		int x=sc.nextInt();
		showcolumn(1 , x);
		
	}
}