package Practise;

public class practise_factorial01 
{
	public static int compute(int x)
	{
		if(x==1)
		{
			return x;
		}
		return x*compute(x-1);
	}
	public static void main(String[] args) 
	{
		System.out.println(compute(5));
	}
}
