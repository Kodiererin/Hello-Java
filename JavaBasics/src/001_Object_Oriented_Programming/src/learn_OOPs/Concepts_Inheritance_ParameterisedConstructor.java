// Super keyword ka use hoga
//you have to see how the Constructor overloading and super keyword is working and its impact on the Constructor
//Super keyword does not work in the program after the constructor's body so check it out.
//You can do it
package learn_OOPs;
class Test001
{
	Test001()
	{
		System.out.println("Welcome to The Constructor 1");
	}
	Test001(int x , int y)
	{
		if(x%y==0)
		{
			System.out.println("The Parent Clas Second Constructor has been initiated and "+x+" is divisible by "+y);
		}
	}
	Test001(int x , int y , int z)
	{
		System.out.println("The Parent class third Constructor has been initiated ");
		if(x%y==0 && y%x==0)
		{
			System.out.println("The third constructor has been initiated ");
			System.out.println(x+" "+y+" "+z+" are divisible");
		}
	}
}
class Test002 extends Test001
{
	Test002()
	{
//		super();
		System.out.println("The Child class Constructor has been initiated ");
	}
	Test002(int x , int y)
	{
		super(x,y);
		System.out.println("The child class Second Constructor has been initiated ");
		if(x%y==0)
			System.out.println(x+" "+y+" is divisible");
	}
	Test002(int x , int y , int z)
	{
		super(x,y,z);
		System.out.println("The Child clas third Constructor Has been initiated ");
	}
}
public class Concepts_Inheritance_ParameterisedConstructor 
{
	public static void main(String[] args)
	{
//		Test002 t2 = new Test002();
//		Test002 t3 = new Test002(20,10);
		Test002 t4 = new Test002(30,20,10);
	}
}
