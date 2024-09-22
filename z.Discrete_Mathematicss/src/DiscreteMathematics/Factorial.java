package DiscreteMathematics;
class FindFactorial 
{
	public static int findFactorial(int x)
	{
		if(x==0)
			return x;
		int y = 1;
		for(int i=1 ; i<=x ; i++)
		{
			y = y*i;
		}
		return y;
	}
}
class Factorial
{
	public static void main(String [] args)
	{
		System.out.println(FindFactorial.findFactorial(5));
	}
}