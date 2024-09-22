import java.util.*;
class Circle1
{
	private int radius;
	public int getname()
	{
		return radius;
	}
	public void setName(int x)
	{
		if(x>0)
		radius = x;
	}
	public double area(int y)
	{
		return 4*3.14*y*y;
	}
}
public class Circle_Private 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Radius of the Circle");
			int x = sc.nextInt();
		Circle1 hi = new Circle1();
		hi.setName(x);
		System.out.println(hi.area(x));
				
	}
}
