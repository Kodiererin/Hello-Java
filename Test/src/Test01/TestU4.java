// use of extends and interface keyword
package Test01;
interface Test0001
{
	void show1();
}
interface Test0002
{
	void show2();
}
class Hello implements Test0001,Test0002
{
	public void show1()
	{
		System.out.println("Kemcho");
	}
	public void show2()
	{
		System.out.println("MOjamaaaa");
	}
}
class Hello1 extends Hello
{
	public void show1()
	{
		System.out.println("Kemon Aacho");
	}
	public void show2()
	{
		System.out.println("Bhalo aacho");
	}
}
public class TestU4 
{
	public static void main(String[] args)
	{
		Hello1 pajji = new Hello1();
		pajji.show1();
		pajji.show2();
	}
}
