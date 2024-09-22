public class Recursion_practise 
{
	public static void printkrodidi(int n)
	{
		if(n>=6)
		{
			return;
		}
		System.out.print(n+" , ");
		printkrodidi(n+1);
	}
	public static void main(String[] args)
	{
		int bhaiya =1 ;
		printkrodidi(1);
	}
}
