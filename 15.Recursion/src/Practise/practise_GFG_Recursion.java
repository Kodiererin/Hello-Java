package Practise;

public class practise_GFG_Recursion 
{
	static int i=1;
	static void printSum(int N)
	{
		if(i>N) return;
		System.out.print(i+" ");
		i++;
		printSum(N);
	}
	public static void main(String[] args) 
	{
		printSum(10);
	}
}
