import java.util.*;
public class PowerOfXuptoN 
{
	static void print(long x , long y)
	{
		if(y>=0)
		{
			x = x*x;
			System.out.println(x);
			y--;
			print(x,y);
		}
		else
		{
			return;
		}
	}
	public static void main(String[] args)
	{
		long x = 2L;
		long y = 10L;
		y = y-1;
		System.out.println(x);
		print(x,y);
	}
}
