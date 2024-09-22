import java.util.*;
public class Loop_Heart 
{
	public static void main(String[] args) 
	{
		for(int i=1 ; i<=4 ; i++)
		{
			{
			for(int space = 3 ; space>=1 ; space--)
			{
				System.out.print(" ");
			}
			for(int j=1 ; j<=13 ; j++)
			{
				if(i==1 )
				{
					if(j==4 || j==5 || j==9 || j==10)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
					
				}
				if(i==2 )
				{
					if(j==3 || j==4 || j==5 || j==9 || j==10 || j==6 || j==8 || j==11)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				
				}
				if(i==3 )
				{
					if(j==2|| j==7|| j==12 || j==3 || j==4 || j==5 || j==9 || j==10 || j==6 || j==8 || j==11)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				
				}
			if(i==4)
			{
				System.out.print("*");
			}
				}
			System.out.println();
			}
		}
		int ctr=1;
		for(int m=4 ; m<=10 ; m++)
		{
			for(int mm = 1 ; mm<=m ; mm++)
			{
				System.out.print(" ");
			}
			for(int mmm = 1 ; mmm<=(13-(ctr*2)) ; mmm++)
			{
				System.out.print("*");
			}
			ctr++;
			System.out.println();
		}
	}}


