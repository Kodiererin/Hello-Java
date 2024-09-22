import java.util.Scanner; // problem exist please check
class Cylinder3
{
	private int radius;
	private int height;
	private int sRadius;
	
	public int getRadius()
	{
		return radius;
	}
	public int setHeight()
	{
		return height;
	}
	public int getRadius2()
	{
		return sRadius;
	}
	Cylinder3(int x , int y)
	{
		radius = x;
		height = y;
	}
	Cylinder3(int x)
	{
		sRadius = x;
	}
	public void calVol(int x , int y)
	{
		System.out.println("The volume of the Cylinder is "+(3.14*x*x*y));
	}
	public void calSurArea(int x , int y)
	{
		System.out.println("The Surface area of the Cylinder is "+((2*3.14*x*y)+(2*3.14*x*x)));
	}
	public void calVol1(int z)
	{
		System.out.println("The Volume of the Sphere is "+((4/3)*3.14*z*z*z));
	}
	public void calArea2(int z)
	{
		System.out.println("The Surface area of the Sphere is "+(4*z*z*3.14));
	}
	
}
class Cylinder_n_Sphere_UsingConstructors2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Cylinder \n2. Circle");
		System.out.println("Enter the Option ");
			int option = sc.nextInt();
		if(option == 1)
		{
			System.out.println("Enter radius of the Cylinder ");
			int x = sc.nextInt();
		System.out.println("Enter the Height of the Cylinder ");
			int y = sc.nextInt();
		Cylinder3 c2 = new Cylinder3(x,y);
		c2.calVol(x, y);
		c2.calSurArea(x, y);
		}
		else
		{
			System.out.println("Enter The Radius of The Sphere ");
			int r = sc.nextInt();
			Cylinder3 c1 = new Cylinder3(r);
			c1.calVol1(r);
			c1.calVol1(r);

		}		
	} 
}