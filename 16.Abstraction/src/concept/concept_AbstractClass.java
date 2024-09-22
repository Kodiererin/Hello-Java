//	 Abstract class ~ Is a class that is used declared methods and variables that is
//						extended and further used operations. It is very different from Interface.


package concept;
abstract class A
{
	int a = 10;
	int x;
	void hello()
	{
		System.out.println("Print Ujjwal ");
	}
	
	void hello2()	
	{
		System.out.println("Hello Ujjwal");
	}
	void Operate()			// this method is written to show that Abstract class can operate methods
	{
		int x = 10;
		int y = 20;
		System.out.println(x+y);
	}
	abstract void show();	
}
abstract class B extends A
{
	int b = 20;
	int x;
	int y;
	void hello()			// void hello() statement is getting overloaded so the new statement will be printed.
	{
		System.out.println("Kemcho Ujjwal Part 2");
	}
	abstract void show();
	abstract void show2();
}
class MyClass extends B
{

	@Override
	void show() 		
	{
		System.out.println("Kemcho Mota Bhai");
	}

	@Override
	void show2() 
	{
		System.out.println("Moja Me Mota Bhai");		
	}
	void modifyX()
	{
		x = 30;
		y = 40;
		a = 30;
		b = 90;
	}
	
	
}
public class concept_AbstractClass 
{
	public static void main(String[] args) 
	{
//		classA obj1 = new classA();				You cannot create object of abstract class
//		classB obj2 = new classB();				You cannot create object of abstract class
		MyClass myc = new MyClass();
		System.out.println(myc.a);
		System.out.println(myc.b);
		System.out.println(myc.x);
		System.out.println(myc.y);
		myc.show();
		myc.show2();
		myc.hello();
		myc.modifyX();
		System.out.println(myc.x);
		System.out.println(myc.y);
		System.out.println("=========== Checking Some Extra Functions ============");
		 	myc.Operate();
		 	
	}
}
