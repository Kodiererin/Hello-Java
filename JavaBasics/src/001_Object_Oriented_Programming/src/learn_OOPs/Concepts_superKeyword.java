package learn_OOPs;
class kemchoUjjwal
{
	int a;
	kemchoUjjwal(int a)
	{
		this.a = a;
		System.out.println("Hello Ujjwal");
	}
	public int returnnone()
	{
		return 1;
	}
	kemchoUjjwal()
	{
		System.out.println("I am a empty Constructor 1");
	}
}
class majama extends kemchoUjjwal
{
	majama(int x)
	{
		super(x);
		System.out.println("I am a Majama Constructor");
	}
	majama()
	{
//		super(); // comment in and comment out to focus on your desired output and see the result.
		System.out.println(" I am an Empty Constructor 2 ");
	}
}
public class Concepts_superKeyword 
{
	public static void main(String[] args)
	{
		majama m1 = new majama();
//		majama m2 = new majama(5);
	}
}
