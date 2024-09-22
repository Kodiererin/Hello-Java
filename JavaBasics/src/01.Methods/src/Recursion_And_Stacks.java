class Recursion_And_Stacks
{
	static int kemcho(int x , int n)
	{
		if(n==0)
		{
			return 1;
		}
		if(x ==1)
		{
			return 1;
		}
		if(n%2==0)
		{
			return kemcho(x,n/2)*kemcho(x,n/2);
		}
		else
		{
			return kemcho(x,n/2)*kemcho(x,n/2)*x;
		}
	}
	public static void main(String[] args)
	{
		int x=2 , y=5;
		System.out.println(kemcho(2,5));
	}
}