import java.util.*;
class Recursion_Factorial
{
	static int factorial(int x)
	{
		if(x==0 || x==1)
		{
			return 1;
		}
		else
		{
			System.out.print(x+" * ");
			return x*factorial(x-1);
		}
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int x = sc.nextInt();
		x = factorial(x);
		System.out.println(x);
		
	}
}