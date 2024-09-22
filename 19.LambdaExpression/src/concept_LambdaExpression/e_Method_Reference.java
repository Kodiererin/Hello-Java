package concept_LambdaExpression;

interface myLambda6
{
	public void display(String str);
}

public class e_Method_Reference 
{
	public static void reverse(String str)
	{
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
//		System.err.println(sb);		for error
		System.out.println(sb);
	}
	public void reverse2(String str)
	{ 
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
//		System.err.println(sb);		for error
		System.out.println(sb);
	}
	public static void main(String[] args) 
	{
		myLambda6 ml = System.out::println;
		
//		Dynamically We can assign any method and call it! by Taking an Object
		e_Method_Reference obj = new e_Method_Reference();
		myLambda6 ref = obj::reverse2;
		
		myLambda6 ml2=e_Method_Reference::reverse;
		ml2.display("Hello World");
		
//		 
	}
}

//	::Println method will assign to display method.
//	  Display method will work as Println Method.
//	  Whatever the string I pass it will print.
//	:: is called scope resolution.
	