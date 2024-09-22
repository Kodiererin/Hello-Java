import java.util.*;
class CC
{
	int radius; // atrributes
//	aur neeche sb method hai
	public double calculatearea(int x)
	{
		return 3.14*(x*x);
	}
	public double calculateperimeter(int x)
	{
		return 2*3.14*x;
	}
	public void show()
	{
		System.out.println("The area of the Circle is "+calculatearea(radius));
		System.out.println("The Perimeter of the Circle is "+calculateperimeter(radius));
	}
}
// Yha se main class shuru ho rha h..
public class Circle 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		CC uu  = new CC();
		System.out.println("Enter the Radius of the Circle ");
			int x = sc.nextInt();
		uu.radius = x;
		uu.show();
	}
}
