//Code with harry
//Write a recursive function to calculate the sum of the first n natural numbers
class Recursion_SumofNnumbers
{
	static int count = 20;
	static int printkrisko(int x)
	{
		if(count>=0)
		{	
			x = x+1;
			int z = x;
			x = printkrisko(x);
			x = z;
			count--;
		}
		return x;
	}
	public static void main(String[] args)
	{
		int a = 20;
		System.out.println(printkrisko(a));
	}
}