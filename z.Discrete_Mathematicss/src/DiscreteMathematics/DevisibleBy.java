package DiscreteMathematics;

public class DevisibleBy 
{
	public static void main(String[] args)
	{
		int ctr = 0;
		for(int i=1000 ; i<=9999 ; i++)
		{
			if(i%5==0 && i%7!=0)
			{
				ctr++;
			}
		}
		System.out.println(ctr);
	}
}
