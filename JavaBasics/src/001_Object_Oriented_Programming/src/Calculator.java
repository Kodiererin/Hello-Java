import java.util.*;
class Calculate123
{
	static int num1;
	static int num2;
	Calculate123(int x , int y)
	{
		num1 = x;
		num2 = y;
	}
	public void add()
	{
		 System.out.println("The Sum is "+(num1+num2));
	}
	public void sub()
	{
		System.out.println("The Difference is "+(num1-num2));
	}
	public void mul()
	{
		System.out.println("The Product is "+(num1*num2));
	}
	public void div()
	{
		System.out.println("The Quotient is "+(num1/num2));
		System.out.println("The Remainder is "+(num1%num2));
	}
	public void pow()
	{
		System.out.println("The Power is "+(Math.pow(num1, num2)));
	}
	public void squaret()
	{
		System.out.println("The root over is "+(Math.pow(num1, (1/num2))));
	}
	Calculate123(int x)
	{
		num1 = x;
		num2 = 0;
	}
	public void log()
	{
		System.out.println("The Log function is "+(Math.log(num1)));
		System.out.println("The Log function of base 10 is "+(Math.log10(num1)));
	}
	public void exp()
	{
		System.out.println("The Exponential Function is "+(Math.exp(num1)));
	}
	
}
public class Calculator 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The two Numbers ");
		System.out.println("Press Zero for Single Number Evaluation ");
			int x = sc.nextInt();
			char xy = sc.next().charAt(0);
			int y = sc.nextInt();
			Calculate123 cal = new Calculate123(x,y);
		if(xy=='+')
		{
			cal.add();
		}
		if(xy=='-')
		{
			cal.sub();
		}
		if(xy=='/')
		{
			cal.div();
		}
		if(xy=='p')
		{
			cal.pow();
		}
		if(xy=='s')
		{
			cal.squaret();
		}
		if(xy=='l')
		{
			cal.log();
		}
		if(xy=='e')
		{
			cal.exp();
		}
	}
}
