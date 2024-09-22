package Practise_OOPs;
import java.util.*;
// Test is a super class that has a certain properties and functions
class Test
{
	int x ;
	int y ;
	
	public void getx(int a , int b)
	{
		x = a;
		y = b;
	}	
}
// test01 is a superclass which although has the properties of Test and add some extra functions to it.
// it adds Sum attribute and shows the sum by creating a method show() to show the sum.................
class test01 extends Test
{
//	int sum;
	public void show()
	{
		System.out.println("The Sum is "+(x+y));
	}
	test01()
	{
		int sum = this.x + this.y;
		System.out.println("Sum = "+sum);
	}
}
// I am creating a derived class to show that I can create a multiple derived class
// And always remember that superclass is always one.
// There is no multiple superclass!
// You can do it.. Just Do it!.....
class test02 extends Test
{
	public void difference()
	{
		if(x>y)
		{
			System.out.println("The Difference of the numbers is "+(x-y));
		}
		else
		{
			System.out.println("The Difference of the Numbers is "+(y-x));
		}
	}
}
public class Practise_Inheritance
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Numbers ");
			int x = sc.nextInt();
			int y = sc.nextInt();
		test01 t1 =  new test01();
			t1.getx(x, y);
			t1.show();
		test02 t2 = new test02();
			t2.getx(x, y);
			t2.difference();
		sc.close();
	}
}