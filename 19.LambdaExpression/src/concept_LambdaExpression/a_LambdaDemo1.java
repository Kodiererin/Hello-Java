package concept_LambdaExpression;

@FunctionalInterface		// annotation Used.
interface myLambda
{
	public void display();
//	public void show();				// error will be show as it is not a Functional Interface
}

//class My implements myLambda
//{
//
//	@Override
//	public void display() 
//	{
//		// TODO Auto-generated method stub
//		System.out.println("Hello World");
//	}
//	
//}


public class a_LambdaDemo1 
{
	public static void main(String[] args) 
	{
//		My obj = new My();
//		obj.display();
		
//		myLambda obj = new My();
//		obj.display();
		
		myLambda obj = new myLambda() 	// creating an anonymous Inner class
		{
			public void display()
			{
				System.out.println("Hello World");
			}
		};
		obj.display();
		
		lambdaExpression();
	}
//	This is the Lambda Expression
	public static void lambdaExpression()
	{
		System.out.println("This is Lambda Expression");
		myLambda obj = ()->
					{
						System.out.println("Hello World");
					};
				obj.display();
	}
}
