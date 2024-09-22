import java.util.*;
class Circle
{
	public static void main(String[] args)
	{
		System.out.println("Enter the Radius of the Circle ");
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int x,y,rr;
		int diameter  = 2*r;
		for(int i=1 ; i<=diameter ; i++)
		{
			for(int j= 1 ; j<=diameter ; j++)
			{
				x = r - i;
				y = r - j;
				rr = x*x + y*y;
				if(rr <= r*r+1)
				{
					System.out.print(j+" ");
				}
				else
				{
					System.out.print("  ");
				}
			}
		System.out.println();
		}
		
	}
}