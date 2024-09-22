package concept_LambdaExpression;
//	We will learn Some new topics like : 
//	1. Can lambda expression have Local variables.
//	2. Can they access local variables or Local variables or not.
//	3. Can they capture Instance variable or not.
//	4. Can they pass Lambda Expression as variables.
interface myLambda4
{
	public void display();
}

class Demo
{
	int temp = 10;
	public void method1()
	{
//		Can I have Multiple statements inside the Lambda Expression? YES!
//		Can we declare variable in the method? Yes.
//		Can it be updated? : Yes!
		
//		final int count=0;
		myLambda4 obj = ()->{
//			int count=0;
//			count++;
//			System.out.println("Hello "+count);
			System.out.println("Kemcho");
			System.out.println("Vaddakam");
			System.out.println(temp+=1);
		};
		obj.display();
	}
}


public class c_Capture_LambdaExpression 
{
	public static void main(String[] args) 
	{
		Demo obj = new Demo();
		obj.method1();
	}
}
