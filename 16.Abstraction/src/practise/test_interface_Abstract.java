package practise;

interface Ujjwal001
{
	void hello();
	int a = 10;
	int c = a;
}
interface helloInterface extends  Ujjwal001
{
	int x = 20;
//	c = 30;			This variable c is not getting overloaded/overrided and so the function is not rewritten and therefore this is showing an error.
	void hello();
}
class myclass02 implements helloInterface
{
	
	@Override
	public void hello() 
	{
		System.out.println("Hello Ujjwal");
	}
	void show()
	{
		System.out.println(x);
		System.out.println(a);
		System.out.println(c);
	}
}
public class test_interface_Abstract 
{
	public static void main(String[] args) 
	{
		myclass02 my = new myclass02();
		my.hello();
		my.show();
	}
}
