package learn_OOPs;
import java.util.*;
class Test1
{
	String name;
	int x;
	Test1(String t , int m) // we are using constructors to learn and understand its implementations
	{
		name = t;
		x = m;
	}
	public void show()
	{
		System.out.println("Your Name is "+name);
		System.out.println("Your System id is "+x);
	}
	
}

public class Concepts_Constructors
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your name and Your System id");
			String name = sc.nextLine();
			int id = sc.nextInt();
		Test1 obj = new Test1(name,id);
		obj.show();
	}
	
}
