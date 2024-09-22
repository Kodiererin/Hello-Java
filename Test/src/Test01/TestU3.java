package Test01;
import java.util.*;
interface Bicycle
{
	int applybrake(int x);
	int accelerate(int y);
}
interface Horn
{
	void horn();
}
class MyCycle implements Bicycle,Horn 
{
	public int a;
	public int applybrake(int x)
	{
		
		if(x==0)
		{
			System.out.println("Emergency Brake");
			return 0;
		}
		return this.a-x;
	}
	public int accelerate(int y)
	{
		if(y==0)
		{
			System.out.println("Emergency Brake");
			return 0;
		}
		return this.a + y;
	}
	public void horn()
	{
		System.out.println("Hat Ja raste se");
	}
}
class TestU3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		MyCycle m1 = new MyCycle();
		System.out.println("Enter Initial Speed");
		m1.a = sc.nextInt();
		System.out.println("Accelerate or Deaccelerate");
			int x = sc.nextInt();
		if(x==1)
		{
			System.out.println("Enter the Speed");
			int m = sc.nextInt();
			System.out.println("Accelerating");			
			System.out.println("The Speed is "+(m1.accelerate(m)));
		}
		else
		{
			System.out.println("Enter the speed ");
			int n = sc.nextInt();
			System.out.println("deaccelerating");			
			System.out.println("The Speed is "+m1.applybrake(n));
		}
			
	}
}