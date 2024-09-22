package DiscreteMathematics;
public class Decimal_Binary 
{
	public static void Binary(int x )
	{
		int m;
		String show;
		do
		{
			m = x%2;
			x = x/2;
//			show = ""+m;
			System.out.print(m);
		}while(x!=0);
//		System.out.println(show);
	}
	public static void main(String[] args)
	{
		System.out.println("Left to Right the Code is Going to show output");
		int x = 6;
		Binary(x);
	}
}

