package Test01;
import java.util.*;
class factorial
{
//	int x ;
	public static int factorise(int x , int y)
	{
		if(x==0)
			return x;
		for(int i=1 ; i<=x ; i++)
			y = y*i;
		
		return y;
	}
	public static void permute(int x , int y)
	{
		int yminusx = y-x;
//		if(yminusx == 0)
//			return x;
//		if(y==0)
//			return y;
		int a = factorise(yminusx , 1);
		System.out.println(a);
		int b= factorise(x , 1);
		System.out.println(b);
//		return b/a;
		System.out.println(b/a);
	}
}
class TestU2
{
	public static void main(String[] ujjwal)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("What you need Permutation or Combination ");
		System.out.println("1. Permutation \n2. Combination");
		int option = sc.nextInt();
		switch(option)
		{
		case 1:
		{
			System.out.println("Enter Two Numbers That you want to permute ");
			int x = sc.nextInt();
			int y = sc.nextInt();
			factorial f1 = new factorial();
			factorial.permute(x, y);
//			System.out.println(n);
		}
		}
	}
}