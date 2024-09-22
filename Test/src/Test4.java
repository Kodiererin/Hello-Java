import java.util.*;
class Test4
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number =");
		char c = sc.next().charAt(0);
		int x=c;
//		int x = sc.nextInt();
		System.out.println("The number is "+x);
		int a , b , z ;
		int d = 0;
		double m = 0.0;
		do
		{
			a = x/2;
			b = x%2;
			System.out.print(b+"");
			x = a;
			d = a;
		}while(d !=0);
	}
}