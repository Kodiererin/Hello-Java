import java.util.*;
class honeysingh
{
	int length;
	int breadth;
	public int calculateperimeter(int x , int y)
	{
		return 4*(x+y);
	}
	public int calculatearea(int x , int y)
	{
		return x*y;
	}
	public void show()
	{
		System.out.println("The Area of the rectangle "+calculatearea(length , breadth));
		System.out.println("The Perimeter of the Square is "+calculateperimeter(length , breadth));
	}
}
public class Rectangle 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		honeysingh yo = new honeysingh();
		System.out.println("Enter the Length of the Rectangle ");
		yo.length = sc.nextInt();
		System.out.println("Enter the breadth of the Rectangle");
		yo.breadth = sc.nextInt();
		yo.show();
	}
}
