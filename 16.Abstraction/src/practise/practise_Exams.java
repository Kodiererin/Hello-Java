package practise;
class A
{
	A()
	{
		System.out.println("Constructor of A");
	}
	void show()
	{
		System.out.println("Method Of A");
	}
}
class B extends A
{
	B()
	{
		System.out.println("Constructor of B");
	}
	void show()
	{
		System.out.println("Method Of B");
	}
}
class C extends A,B
{
	
}
public class practise_Exams {

}
