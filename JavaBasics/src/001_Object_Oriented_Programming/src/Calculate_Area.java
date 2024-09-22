// yes yes I did it !.............................................................................
import java.util.*;
class Kemchomotabhai
{ 
	int side; // attribute for the side
	// method creation for getting data
	public void getdata(int x) 
	{
		side = x;
	}
//	method creation for calculate area
	public int calculatearea(int side)
	{
		return side*side;
	}
//	method creation for calculating perimeter
	public int calculateperimeter(int pmt)
	{
		return 4*side;
	}
//	method creation for output
	public void show()
	{
		System.out.println("The Area of the Square "+calculatearea(side));
		System.out.println("The Perimeter of the Square is "+calculateperimeter(side));
	}
}
class Calculate_Area
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side of the square");
		int x = sc.nextInt();
		Kemchomotabhai yo = new Kemchomotabhai();
		yo.side = x;
		yo.show();
	}
}