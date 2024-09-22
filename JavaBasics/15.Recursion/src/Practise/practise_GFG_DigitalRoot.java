package Practise;

public class practise_GFG_DigitalRoot 
{
	static int sum = 0;
	static int digitalRoot(int n)
	{
		if(n==0) 
		{
			if(sum<10) return sum;
			if(sum>=10) 
				{
					n = sum;
//					System.out.println(n);
					sum = 0;
//					System.out.println(sum);
//					digitalRoot(n);
				}
		}
		int x = n%10;
		sum = x+sum;
		return digitalRoot(n/10);
	}
	static int digitalRoot_method2(int n)			// this code was copied from the GFG website discussion board!.. :-)
	{
		if(n<=9)
		   {
				System.out.println(n);
		       return n;
		   }
		   int s=n%10+digitalRoot(n/10);
		   System.out.println(s);
		   return digitalRoot(s);
	}
	public static void main(String[] args) 
	{
		System.out.println("The Digital Root of the Given Input is "+digitalRoot(27640));
		System.out.println("----------------------------------------------------------------");
		System.out.println("The Digital Root of the Given Input is "+digitalRoot_method2(27640));
	}
}
