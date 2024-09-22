//	This concept was taught in College by Santosh Sir

package learn_OOPs_Passsing_n_ReturningObjects;
//	Java Program to demonstrate Objects Passing to Methods
class ObjectPassDemo
{
	int a;
	int b;
//	constructor
	ObjectPassDemo(int i , int j)
	{
		this.a = i;
		this.b = j;
	}
//	method 
	boolean equalTo(ObjectPassDemo o)
	{
//		return true if o is equal to invoking
//		object notice an object is passed as an argument to method
		return (o.a == a && o.b == b);
	}
}
public class concept_Object_As_Arguments 
{
	public static void main(String[] args) 
	{
//		main driver Method
//		checking weather objects are equal as custom value
//		above passed and printing corresponding boolean value
		ObjectPassDemo ob1 = new ObjectPassDemo(100,20);
		ObjectPassDemo ob2 = new ObjectPassDemo(100,20);
		ObjectPassDemo ob3 = new ObjectPassDemo(-1,-1);
		System.out.println("ob1 == ob2 - "+ob1.equalTo(ob2));		
		System.out.println("ob1 == ob3 - "+ob1.equalTo(ob3));		
	}
}
