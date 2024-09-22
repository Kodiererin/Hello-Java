//	 Dynamic Method Dispatch also known as RUN TIME POLYMORPHISM
//	 Objective is to use the Parent class methods to Child class.
//	 You cannot create child class object with main class. SO BE AWARE.
//--------------------------------------------------------------------------------------------
package learn_OOPs;
class Phone
{
	public void power()
	{
		System.out.println("The Phone is Powering on");
	}
	public void greeting()
	{
		System.out.println("Welcome User");
	}
}
class Smartphone extends Phone
{
	public void power()
	{
		System.out.println("The Smartphone is Powering On");
	}
	public void greeting()
	{
		System.out.println("Welcome user to the Smartphone");
	}
	public void camera()
	{
		System.out.println("Opening Camera");
	}
}
public class Concepts_Dynamic_Programming_Method 
{
	public static void main(String[] args)
	{
		Phone p1 = new Smartphone();		// you can create an object a object of Parent class with child class.
		p1.power();
		p1.greeting();
//		p1.camera() will not be initiated because you have not made an object on smartphone
		
//		Smartphone p2 = new Phone(); 		you cannot create an object of child class with parent class
		
		Smartphone p2 = new Smartphone();				// allowed.............................
		p2.camera();								
		
	}
}
