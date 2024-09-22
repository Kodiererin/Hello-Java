//Product of x*x upto n
import java.util.*;
public class X_power_N_uptoN 
{
	static void powershow(int x , int y)
	{
		if(y>=0)
		{
			int ctr = x*x;
			System.out.println(x+" x "+x+" = "+ctr);
			powershow((x+1), (y-1));
		}
		else
		{
			return;
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first Number ");
		int x = sc.nextInt();
		System.out.println("Enter the Limit ");
		int y = sc.nextInt();
		y = y-1;
		System.out.println(x);
		powershow(x,y);

	}
}
