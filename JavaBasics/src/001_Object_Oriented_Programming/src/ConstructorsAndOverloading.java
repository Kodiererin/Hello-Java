import java.util.*;
class smile
{
	int a;
	int b;
	int c;
	String d;
	smile(int x,int y)
	{
		a = x;
		b = y;
		System.out.println("The Numbers are "+a+" and "+y);
	}
	smile(String x , int p , int q , int r)
	{
		d = x;
		a = p;
		b = q;
		c = r;
		System.out.println("Good Morning "+d+"The numbers are "+a+" "+b+" "+c);
	}
}
public class ConstructorsAndOverloading 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name ");
			String name = sc.nextLine();
		System.out.println("Enter The Number you want to the add ");
			int x = sc.nextInt();
			int y = sc.nextInt();
		System.out.println("Enter The Three Numbers that you want to add ");
			int z = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
		smile sm = new smile(x,y);
		smile sm2 = new smile(name , z , a, x);
		
		
		
		
	}
}
