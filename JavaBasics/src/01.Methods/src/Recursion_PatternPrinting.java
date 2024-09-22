class Recursion_PatternPrinting
{
	public static void tukrega(int x)
	{
		if(x==0)
		{
			return;
		}
		System.out.print("x ");
		tukrega(x-1);
	}
	public static void kemcho(int n , int i)
	{
		if(n==0)
		{
			return;
		}
		tukrega(i);
		System.out.println();
		kemcho(n-1 , i-1);
	}
	public static void main(String[] args)
	{
		int n=5;
		kemcho(n,5);
	}
}