package concept_LambdaExpression;
@FunctionalInterface			// this is a functional Interface

//	FunctionalInterface Method that takes Parameters
interface myLambdaa
{
	public void display(String string);
}

interface myLambda2						// this interface takes multiple parameter
{
	public void add(int x , int y);
}

interface myLambda3
{
	public int product(int a , int b);
}
public class b_ParametersIn_LambdaExpression  
{
	public static void main(String[] args) 
	{
		myLambdaa m=(s)->{System.out.println("Displaying the Interface "+s);};
		m.display("Ujjwal");
		m.display("23");
		
		myLambda2 obj=(a,b)->{System.out.println("The Sum is "+(a+b));};
		obj.add(3, 4);
		
//		myLambda3 obj2=(a,b)->{return a*b;};
		myLambda3 obj2=(a,b)->a*b;				// return type is Integer.
//		We can write Expression like Methods that is why it is called Lambda Expression.
		System.out.println("The Product is "+obj2.product(3, 4));
	}
}
