import java.util.*;
public class Patterns {

	public static void main(String[] args) 
	{
		for(int i=1 ; i<=3 ; i++)
		{
			int m = i*i;
			for(int j=i ; j<=i*m ; j++)
			{
				System.out.print(" @ ");
			}
			System.out.println(" # ");
		}
	}
}
