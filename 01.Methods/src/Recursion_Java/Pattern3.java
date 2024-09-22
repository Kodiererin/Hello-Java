package Recursion_Java;
public class Pattern3 
{
	static void column(int initial , int x)
	{
		if(initial<=x)
		{
			row(initial , x);
			System.out.println();
			column(initial+1 , x);
		}
		else
		{
			return;
		}
	}
	static void row(int initialrow ,  int y)
	{
		if(initialrow<=y)
		{
			System.out.print(" x ");
			row(initialrow+1 , y);
		}
		else
		{
			return ; 
		}
	}
//	static void rowSpace()
//	{
//		
//	}
	public static void main(String[] args)
	{
		column(1 , 5);
	}
}