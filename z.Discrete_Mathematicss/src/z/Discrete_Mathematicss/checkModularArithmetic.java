package z.Discrete_Mathematicss;
import java.util.*;
public class checkModularArithmetic 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Numbers ");
			int x = sc.nextInt();
			int y = sc.nextInt();
		System.out.println("Enter Mod Number ");
			int m = sc.nextInt();
		if(x%m==y%m)
		{
			System.out.println(x+" is the modular arithmetic of "+y+" mod "+m);
		}
		else
		{
			System.out.println("Error ");
		}
	}
}
