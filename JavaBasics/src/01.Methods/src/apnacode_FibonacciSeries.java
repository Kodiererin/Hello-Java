//kem cho mota bhai
import java.util.*;
import java.util.*;
public class apnacode_FibonacciSeries 
{
	static void showkrbhai(int x , int y , int count)
	{
		if(count>=0)
		{
			int z = x+y;
			x = y;
			y = z;
			System.out.print(y+" ");
			showkrbhai(x , y , count-1);
		}
		else
		{
			return;
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Starting Point ");
			int x = sc.nextInt();
		System.out.print("Enter the Second Starting Point ");
			int y = sc.nextInt();
		System.out.print("Enter the Number of Numbers ");
			int z = sc.nextInt();
		x = x-1;
		showkrbhai(x,y,z);
	}
}