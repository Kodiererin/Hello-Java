package DiscreteMathematics;
import java.util.*;
public class GCD 
{
	public static int findGCD(int x , int y)
	{
		if(y>x) {
			y = y+x;
			x = y-x;
			y = y-x;
		}
		if(x==0)
			return x;
		if(y==0)
			return y;
		int temp;
		int temp2;
		if(x>y)
		{
			do
			{
				System.out.print(x+" ");
				temp = x/y;
				temp2 = x%y;
				System.out.print("	=	"+y+"	*	"+temp+"	+	"+temp2+"\n");
				x = y;
				y = temp2;
				if(x==0)
					return y;
			}while(y!=0);
		}
		return x;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Euclidean Algorithm ");
		System.out.println("Enter The Numbers");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		System.out.println(findGCD(x,y));
	
}
}
