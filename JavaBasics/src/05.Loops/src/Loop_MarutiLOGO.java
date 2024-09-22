public class Loop_MarutiLOGO 
{
	public static void main(String[] args)
	{
		int n = 4;
		for(int i=1 ; i<=n ; i++)
		{
			for(int j=1 ; j<=i ; j++)
			{
				System.out.print("x ");
			}
			for(int k=1 ; k<=2*((2*n)-(2*i)) ; k++)
			{
				System.out.print(" ");
			}
			for(int m=1 ; m<=i ; m++)
			{
				System.out.print(" x");
			}
			System.out.println();
		}
		for(int i=n ; i>=1 ; i--)
		{
			for(int j=1 ; j<=i ; j++)
			{
				System.out.print("x ");
			}
			for(int k=1 ; k<=2*((2*n)-(2*i)) ; k++)
			{
				System.out.print(" ");
			}
			for(int m=1 ; m<=i ; m++)
			{
				System.out.print(" x");
			}
			System.out.println();
		}
	}
}