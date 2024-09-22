class Pattern_Diamond
{
	public static void main(String[] args)
	{
		for(int i=0 ; i<=5 ; i++)
		{
			for(int k=5 ; k>=i ; k--) // for spaces 
			{
				System.out.print(" ");
			}
				for(int j=1 ; j<=i ; j++) // for rows
				{
					System.out.print("x ");
				}
		System.out.println();
		}
		for(int i=1 ; i<=5 ; i++) // for columns
		{
			for(int k=1 ; k<=i ; k++) // for spaces
			{
				System.out.print(" ");
			}
				for(int j=5 ; j>=i ; j--) // for rows
				{
					System.out.print("x ");
				}
			System.out.println();
		}
		}
}