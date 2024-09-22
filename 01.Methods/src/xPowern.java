import java.util.*;
public class xPowern 
{
	static int apundon(int x , int y)
	{
		if(y==0)
		{
			return 1;
		}
		if(x==0)
		{
			return 0;
		}
		int okay = apundon(x,(y-1));
		okay = x*okay;
		return okay;
	}
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter x and the power you need");
	int x = sc.nextInt();
	int y = sc.nextInt();
	int sum = apundon(x,y);
	System.out.println(sum);
}}
