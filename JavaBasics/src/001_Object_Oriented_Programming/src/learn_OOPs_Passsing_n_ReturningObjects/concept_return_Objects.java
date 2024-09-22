//	Java Program to demonstrate Returning Objects
package learn_OOPs_Passsing_n_ReturningObjects;
//	Class 1
class ObjectReturnDemo
{
	int a;
//	constructor
	ObjectReturnDemo(int i)
	{
		this.a = i;
	}
//	Method returns an Object
	ObjectReturnDemo incrementbyTen()
	{
		ObjectReturnDemo temp = new ObjectReturnDemo(a+10);
		return temp;
	}
}
//	Main Class
public class concept_return_Objects 
{
	public static void main(String[] args) 
	{
		ObjectReturnDemo ob1 = new ObjectReturnDemo(2);
		ObjectReturnDemo ob2;
		
		ob2 = ob1.incrementbyTen();
//		object 2 is invoking object 1 and is saying to use incrementbyTen method to increment the number by 10!
		System.out.println("ob1.a : "+ob1.a);
		System.out.println("ob2.a : "+ob2.a);	
	}
}
