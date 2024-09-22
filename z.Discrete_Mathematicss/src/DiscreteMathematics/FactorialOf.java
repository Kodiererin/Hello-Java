package DiscreteMathematics;
public class FactorialOf 
{
	public static int calculateFactorial(int x)
	{
		if(x==0)
			return x;
		int i=2;
		do
		{
			if(x%i==0) {
				System.out.println(i+" | "+x);
				x = x/i;
			}
			else
				i++;
		}while(i<=x);
		return x;
	}
	public static void main(String[] args)
	{
		int a = calculateFactorial(561);
	}
}
