// Program to se method overloading 
package learn_OOPs;
class Test4
{
	Test4(String x , int y) // these are the parameterised constructors that carry some parameters to excecute
	{
		System.out.println("Good Morning "+x+" Your Employee id is "+y);
	}
	Test4(String x)
	{
		System.out.println("Good Morning "+x);
	}
	Test4(int x)
	{
		System.out.println("Your Employee id is "+x);
	}
}
public class Concepts_ConstructorOverloading 
{
	public  static void main(String[] args)
	{
//		we have to create a new object every time we create a object
		Test4 tt = new Test4("Ujjwal ", 45);
//		and it is necesaary to create a object a new object every time we create as we are seeing
		Test4 tt1 = new Test4("Ujjwal");
		Test4 tt2 = new Test4(98);
	}
}
