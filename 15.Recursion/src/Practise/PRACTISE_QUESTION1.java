package Practise;
public class PRACTISE_QUESTION1 
{
	public static void printMyStack(int n)
	{
 		if(n==0)
			return;
		System.out.println(n);
		n -=1;
		printMyStack(n);
		if(n==0)
			return;
		System.out.println(n);
	}
	public static void main(String[] args) 
	{
		printMyStack(5);
	}
}
