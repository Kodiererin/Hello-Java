package Recursion_Java; // fir se samajh ke solve krne ka kosish krna
public class Pattern4_Triangle 
{
	static void column(int i , int x , int rowi , int rowspace)
	{
		if(i<=x)
		{
			row(i , x , rowi , rowspace);
			System.out.println();
			column(i+1 , x , rowi , rowspace);
		}
	}
	static void row(int a , int b , int c , int d) 
	{
//		rowSpace(a , b , c , d);
		if(c<=a)
		{
//			rowSpace(a , b , c , d);
			System.out.print("x");			
			row(a , b , c+1 , d);
		}
		else
		{
			return;
		}
	}
	
	static void rowSpace(int m , int n , int o , int space)
	{	
		 if(space<=n)
		 {
			 System.out.print(" ");
			 rowSpace(m , n , o , space+1);
		 }
		 else
		 {
			 return;
		 }
	}
	public static void main(String[] args)
	{
		column(1 , 5, 1 , 1);
	}
}
