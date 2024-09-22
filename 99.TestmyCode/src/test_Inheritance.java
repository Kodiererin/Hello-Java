//	This code has been copied from Concept_Inheritance.

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
	int sum;
	public void show()
	{
		System.out.println("The Sum is "+(x+y));
	}
}
// I am creating a derived class to show that I can create a multiple derived class
// And always remember that superclass is always one.
// There is no multiple superclass!
// You can do it.. Just Do it!.....(motivation )
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
//	Testing a Thing.
class test03 extends Test
{
	public void difference01()
	{
		System.out.println("The Variable x has "+this.x);
		System.out.println("The Variable y has "+this.y);
	}
	public void show()
	{
		int m = this.x;
			System.out.println("m has "+m);
		m = this.y;
			System.out.println("m has "+m);
	}
}
class test_Inheritance
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
//		my testing and editing begins here...
//		dhat teri mera method kaam kyu nhi kr rha h!...
//		test03 class ko dekho woh extend kyu nhi ho rha h!
		test03 t3 = new test03();
//			t3.difference();
			t3.difference01();
			t3.show();
//		System.out.println(""); 			~> Problem in printing emoticons.
	}
}