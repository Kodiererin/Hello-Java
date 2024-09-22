package Practise;
public class practise_Factorial 
{
	public static int returnFactorial(int x)
	{
		if(x==1)
		{
			return x;
		}	
		return x*returnFactorial(x-1);
	}
	public static void main(String[] args) 
	{
		System.out.println("The Factorial of 5 is "+returnFactorial(5));
	}
}
