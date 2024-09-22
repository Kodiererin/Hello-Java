package practise_Generics;

public class method_Generic 
{
	public static<T> boolean check(T value , T value1)
	{
		return (value.equals(value1));
	}
	public static void main(String[] args) 
	{
		System.out.println(check(10,10));
	}
}
