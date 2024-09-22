//The Private Access Modifier , getters and setters has been used...

import java.util.*;
class Cylinder1
{
	private int radius ; // attributes are set to private
	private int height;	// attributes are set to private
	
	public int getradius()
	{
		return radius;
	}
	public int setradius(int x)
	{
		return radius = x;
	}
	public int getheight()
	{
		return height;
	}
	public int setheight(int y)
	{
		return height = y;
	}
//	Question 1 done
//	Question 2 begins
	public double calculatevolume(int x , int y)
	{
		return 3.14*x*x*y;
	}
	public double calculateSurfacearea(int x , int y)
	{
		return ((2*3.14*x*y) + (2*3.14*x*x));
	}
}
public class Cylinder 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Cylinder1 c1 = new Cylinder1();
		System.out.println("Enter the Radius of The Cylinder ");
			c1.setradius(sc.nextInt());
		System.out.println("Enter the Height of the cylinder ");
			c1.setheight(sc.nextInt());
		System.out.println("The Volume of the Cylinder is "+c1.calculateSurfacearea(c1.getheight(), c1.getheight()));
		System.out.println("The Surface area of the Cylinder is "+c1.calculateSurfacearea(c1.getradius(), c1.getheight()));

			
	}
}
