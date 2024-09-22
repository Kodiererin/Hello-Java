/* Here U will seeing, the use of
 * super keyword
 * method overriding
 * use of abstract class and abstract method
 * extends keyword 
 * */
package Practise_OOPs;
class Test01
{
	Test01()
	{
		System.out.println("HEllO Ujjwal Welcome");
	}
	Test01(int x , int y)
	{
		System.out.println("The Sum is "+(x+y));
	}
	public void hello(int x , int y)
	{
		System.out.println("The Difference is "+(x-y));
	}
}
class SpaceX extends Test01
{
	SpaceX()
	{
		super();
		System.out.println("Kemcho Mota Bhai");
	}
	SpaceX(int x , int y )
	{
		super(x,y);
		System.out.println("The Number is "+x);
	}
	public void hello(int x , int y)
	{
		System.out.println("Minus hai ki "+(x-y));
	}
	
}
abstract class MyTest01
{
	MyTest01()
	{
		System.out.println("HEllo Ujjwal");
	}
	abstract void show();
	abstract void whoAreU();
}
class Intro extends MyTest01
{
	void show()
	{
		System.out.println("My Name is Ujjwal");
	}
	void whoAreU()
	{
		System.out.println("I am Me and alwayas I will be");
	}
}
class Intro2 extends Intro
{
	Intro2()
	{
		System.out.println("Swagat nhi kroge Hamara");
	}
	void show()
	{
		System.out.println("Kaisan Baa");		
	}
	void whoAreU()
	{
		System.out.println("Theek Baa BhaiyaJi");
	}
}
class Test_ManyThings
{
	public static void main(String[] args)	
	{
//		Test_Abstract t1 = new Test_Abstract();
//		MyTest01 myt1 = new MyTest01();
		MyTest01 U1 = new Intro2();
		U1.show();
		U1.whoAreU();
		
	}
	}
}