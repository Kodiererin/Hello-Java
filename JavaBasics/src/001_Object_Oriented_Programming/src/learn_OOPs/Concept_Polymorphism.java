// in my views Polymorphism is just the object making and method call.
// it makes a precise call so that not every functions are accessible

package learn_OOPs;
interface template1
{
	void colour();
	void text();
	private void yooo()					// private method is also accessible
	{	
		System.out.println("Good Morning Bro Kem cho , this is a private method");
	}	
	default void checha() 
	{
		yooo();							// private method!.......................
		System.out.println("which is also accessible, Play n Enjoy");
	}
}
interface template2 extends template1
{
	void background();
	void comments();
}
class PowerPoint implements template2
{
	public void colour() 
	{
		System.out.println("RED");
	}
	public void text() 
	{
		System.out.println("Ujjwal You can Do it.");
	}
	public void background() 
	{
		System.out.println("Natural Scene");
	}
	public void comments() 
	{
		System.out.println("BE +ve Buddy \n");
	}
}
class FreePowerpoint implements template1
{
	public 
	void colour()

	{
		System.out.println("(Free Template ) - Red Colour");
	}
	public void text()
	{
		System.out.println("(Free Template ) - \" Yo Yo Honey Singh \"");
	}
}
public class Concept_Polymorphism 
{
	public static void main(String[] args) 
	{
//		PowerPoint p1 = new PowerPoint();
//		p1.background();
//		p1.colour();
//		p1.comments();
//		p1.text();
//		p1.checha();
		
		// now if you want that those who dont have the premium service access only the FreePowerPoint then you can do it.
		FreePowerpoint fpp = new FreePowerpoint();
		fpp.colour();
		fpp.text();
		fpp.checha();
		//fpp.comments();				// error fhek dega!
		
	}
}
