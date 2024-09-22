//	Understand Generics Data , its classes and Details Necessary to do the Function.
//	Generics is Quite Complicated and so its is necessary to Understand its Database...

package practise_Generics;
@SuppressWarnings("rawtypes")
class GreaterElement<s extends Comparable>
{
	s var1;
	s var2;
	int a = 10;
	GreaterElement(s a , s b)
	{
		this.var1 = a;
		this.var2 = b;
	}
	public void show()
	{
		System.out.println(var1.getClass());
		System.out.println(var2.getClass());
	}
	public void compareData(s a , s b)
	{
		if(a.compareTo(b)==-1)
			System.out.println("b>a");
		if(b.compareTo(a)==-1)
			System.out.println("a>b");
	}
}
class Hello <T extends >
public class question_GreaterElement 
{
	public static void main(String[] args) 
	{
		GreaterElement<Integer> obj1 = new GreaterElement<Integer>(3,5);
		GreaterElement<Double> obj2 = new GreaterElement<Double>(3.5,5.9);
		obj1.show();
		obj1.compareData(3, 5);
	}
}
