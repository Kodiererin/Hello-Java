import java.util.*;
class Cylinder2
{
	private int radius;
	private int height;
	
	public int getRadius()
	{
		return radius;
	}
	public int setHeight()
	{
		return height;
	}
	
	Cylinder2(int x , int y)
	{
		radius = x;
		height = y;
	}
	
	public void calVol(int x , int y)
	{
		System.out.println("The volume of the Cylinder is "+(3.14*x*x*y));
	}
	public void calSurArea(int x , int y)
	{
		System.out.println("The Surface area of the Cylinder is "+((2*3.14*x*y)+(2*3.14*x*x)));
	}
}
class Cylinder_UsingConstructors
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius of the Cylinder ");
			int x = sc.nextInt();
		System.out.println("Enter the Height of the Cylinder ");
			int y = sc.nextInt();
		Cylinder2 c2 = new Cylinder2(x,y);
		c2.calVol(x, y);
		c2.calSurArea(x, y);
		
	} 
}