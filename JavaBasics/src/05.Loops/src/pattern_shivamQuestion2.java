public class pattern_shivamQuestion2
{
	public static void main(String[] args) 
	{
		for(int column=0 ; column<5 ; column++)
		{
			for(int space = 1 ; space<=column ; space++)
			{
				System.out.print(" ");
			}

			for(int row =0 ; row<5-column ; row++)
			{
				System.out.print("x");
			}
			System.out.println();
		}
		for(int column1 = 5 ; column1<10 ; column1++)
		{
			for(int space1 = 9-column1 ; space1>=1 ; space1--)
			{
				System.out.print(" ");
			}
			for(int row=0 ; row<=column1-5 ; row++)
			{
				System.out.print("xx");
			}
			System.out.println();
		}
	}
}

