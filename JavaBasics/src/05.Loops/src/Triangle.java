import java.util.*;
public class Triangle {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your otpion");
			int x = sc.nextInt();
		switch(x)
		{
			case 1:
			{
			for(int i=1 ; i<=10 ; i++)
			{
				for(int j=1 ; j<i ; j++)
				{
					System.out.print(" *");
				}
				System.out.println();
			}
			break;
			}
			case 2:
			{
				for(int i=1 ; i<=10 ; i++)
				{
					if(i<=5)
					{
						for(int j=1 ; j<i ; j++)
						{
							System.out.print("x ");
						}
						System.out.println();
					}
					else
					{
						for(int j=5 ; j<i ; j++)
						{
							System.out.print("y ");
						}
						System.out.println();
					}
				}
			break;
			}
			case 3:
			{
				for(int i=10 ; i>=1 ; i--)
				{
					for(int j=i ; j>=1 ; j--)
					{
						if(j%2!=0)
						{
							System.out.print("P ");
						}
						else if(i%(2*i) == 0)
						{
							System.out.print("E ");
						}
						else
						{
							System.out.print("o ");
						}
						System.out.println();
					}		
				}
			break;
			}
			case 4:
			{
				System.out.println("Enter the number of rows: ");
				 
			    int rows = sc.nextInt();    
			    for (int i=1; i<= rows ; i++) 
			    {
			    	for (int j = rows; j > i ; j--) 
			    	{
			            System.out.print(" ");
			        }
			        System.out.print("*");
			        for (int k = 1; k < 2*(i -1) ;k++) 
			        { 
			        	System.out.print(" "); 
			        }
			        if( i==1) 
			        {
			        	System.out.println(""); 
			        } 
			        else 
			        {
			        	System.out.println("*"); 
			        	} 
			        } 
			    for (int i=rows-1; i>= 1 ; i--)
			        {
			        for (int j = rows; j > i ; j--) 
			        {
			            System.out.print(" ");
			        }
			        System.out.print("*");
			        for (int k = 1; k < 2*(i -1) ;k++) 
			        {
			            System.out.print(" ");
			        }
			        if( i==1)
			            System.out.println("");
			        else
			            System.out.println("*");
			    }
			
			}
			break;
		}

}}
