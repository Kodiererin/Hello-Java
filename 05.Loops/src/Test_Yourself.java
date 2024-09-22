import java.util.*;
class Test_Yourself
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Radius of the Circle ");
		int rad = sc.nextInt();
		int radius = rad;
		int diameter = 2*radius;
//		equation of circle = x*x +y*y = r*r
//		x = diameter - i & y = diameter - y;
//		int radiussquare = (radius+1)*(radius+1);
		int check1 ;
		int check2;
		int checkradius;
		for(int i=0 ; i<=diameter ; i++)
		{
			for(int j=0 ; j<=diameter ; j++)
			{
				check1 = radius - i;
				check2 = radius - j;
				checkradius = (check1*check1) + (check2*check2);
				if(checkradius <= radius*radius+1)
				{
					System.out.print("U "); // print if under the square
				}
				else
				{ 
					System.out.print("  "); // three spaces
				}
			}
			System.out.println();
		}
	}
}