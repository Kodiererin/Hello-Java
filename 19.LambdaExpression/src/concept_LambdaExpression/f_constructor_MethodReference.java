package concept_LambdaExpression;

interface myLambda7
{
	public int display(String str, String str2);
}
public class f_constructor_MethodReference
{
	public f_constructor_MethodReference(String s)
	{
		System.out.println();
	}
	
	public static void main(String[] args) 
	{
		myLambda7 obj = String::compareTo;
//		it will call str.compareTO.str2
		System.out.println(obj.display("hello","hello"));
		System.out.println(obj.display("hello","wello"));	// display between ascii codes is shown
		System.out.println(obj.display("zello","hello"));	// display between ascii codes is shown
	}
}

