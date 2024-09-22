package i_Sorting;

import java.util.Arrays;

class Point implements Comparable<Point>
{
	int x,y;
	Point(int x , int y)
	{
		this.x = x;
		this.y = y;
	}
	@Override
	public int compareTo(Point o)
	{
		return this.x-o.x;
	}
}

public class c_Sorting_nonPrimitive_Method1
{
	public static void main(String[] args)
	{
		Point[] arr = {new Point(10,20),new Point(3,12), new Point(5,7)};
		Arrays.sort(arr);
		for (Point element : arr) {
			System.out.println(element.x+" "+element.y );
		}
	}
}
