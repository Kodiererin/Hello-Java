package Practise_OOPs;
abstract class A
{
	abstract void hello();
	abstract void hello2();
	void show()
	{
		System.out.println("This is the Method of class A");
	}
}
abstract class B extends A
{
	abstract void hello3();
	abstract void  hello4();
	void show2()
	{
		System.out.println("This is the Method of the class B");
	}
}
class Main extends B
{

	@Override
	void hello3() {
		System.out.println("Hello 3");
		
	}

	@Override
	void hello4() {
		System.out.println("Hello 4");
		
	}

	@Override
	void hello() {
		System.out.println("Hello 1");
		
	}

	@Override
	void hello2() {
		System.out.println("Hello 2");
		
	}
	
}
public class test_OOps
{
	public static void main(String[] args) 
	{
		A obj = new Main();
		Main objj2 = new Main();
		objj2.show();
	}
}
