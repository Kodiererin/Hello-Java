package Practise_OOPs;
class AA
{
	AA(int x)
	{
		System.out.println(x);
	}
	AA()
	{
		System.out.println("Hello ");
	}
} 
class BB extends AA
{
	BB(int x)
	{
		super(x);
		System.out.println(x+1);
	}
	BB()
	{
		System.out.println("Kem Cho");
	}
}
public class check_Super 
{
	public static void main(String[] args) 
	{
		BB obj = new BB(98);
		BB obj2 = new BB();
	}
}
