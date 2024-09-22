package z.Discrete_Mathematicss;
import java.util.*;
public class ShorRemainder 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Int m");
		int m = sc.nextInt();
		while(m!=1)
		{
					System.out.println("Enter The Number one ");
					long x = sc.nextLong();
				System.out.println("Enter the Number two");
					long y = sc.nextLong();
				System.out.println("Quotient ="+(x/y));
				System.out.println("Remainder ="+(x%y));
			System.out.println("Enter m");
				m = sc.nextInt();
		}
	}
}
