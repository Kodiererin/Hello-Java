package practise_Generics;
class Test<S>
{
	S variable;
	Test(S var)
	{
		this.variable = var;
	}
	void show()
	{
		System.out.println(this.variable.getClass());
	}
}
public class practise_Generic 
{
	public static void main(String[] args) 
	{
		Test<Integer> obj = new Test<Integer>(45);
		obj.show();
	}
}
