package concept_LambdaExpression;

//	Passing lambda expression as a Parameter

interface myLambda5
{
	public void display();
}
class UseLambda
{
	public void callLambda(myLambda5 ml)
	{
		ml.display();
	}
}
class Demo3
{
	public static void method1()
	{
		UseLambda ul = new UseLambda();
		ul.callLambda(()->{System.out.println("Hello World");});
	}
}
public class d_PassingLambdaExpression 
{
	public static void main(String[] args) 
	{
		Demo3 x = new Demo3();
		x.method1();
	}
}
