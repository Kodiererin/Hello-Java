package Practise;
public class practise_checkTwoFunction 
{
	static void fun(int n)
	{
//		if(n==0)
		if(n<=0)
			return;
		System.out.println("Checking"+n);
		fun(n/2);
//		fun(n-2);
		System.out.println("Checking 2"+n);
		fun(n/2);
//		fun(n-2);
	}
	public static void main(String[] args) 
	{
		fun(5);
	}
}
