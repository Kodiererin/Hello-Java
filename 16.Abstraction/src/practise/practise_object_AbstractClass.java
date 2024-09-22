package practise;
abstract class a
{
	void hello()
	{
		System.out.println("Hello");
	}
	abstract void exam();
}
abstract class b extends a
{
	void hello2()
	{
		System.out.println("Exams me drr lg rha h");
	}
	abstract void schi();
}
class c extends b
{

	@Override
	void schi() {
		System.out.println("Haan Bhai Shi me");
		
	}

	@Override
	void exam() {
		System.out.println("Exams me drrrr lg rha h");
		
	}
	
}
public class practise_object_AbstractClass 
{
	public static void main(String[] args) 
	{
		a obj = new c();
		obj.hello();
		obj.exam();
		
		b obj2 = new c();
		obj.
	}
}