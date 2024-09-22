package learn_OOPs;
interface Shankara
{
	default void show() 			// by default the method will not initialize
	{
		System.out.println("Dhanbad me Apka Swagat hai \n");
	}
	public static void test()		// update 25-07-2022	
	{
		System.out.println("Creating a Test Method");
	}
	void EmergencyNo();
	void autoFare();
	void nearestUnder(int x);
}
class Dhanbad implements Shankara
{
	public void EmergencyNo()
	{
		System.out.println("Emergency No = 100,101 \n");
	}
	public void autoFare()
	{
		System.out.println("Local Fare - 10/-");
		System.out.println("Station to Koylanagar 25/-");
		System.out.println("Station to BigBazar - 25/- \n ");
	}
	public void nearestUnder(int x)
	{
		System.out.println("Pefer Google Map for Precise Result for places under "+x+" distance");
	}
}

class introduce_default
{
	public void show()
	{
		System.out.println("-----------Default Method in Interface-----------------");
		System.out.println("1. When user makes an complex code with interface, , and so to solve such problems");
		System.out.println("2. then to add new methods in interface it becomes difficult");
		System.out.println("3. Default Method was introduced, which allows the user to add methods in the interface ");
		System.out.println("4. And use it without Implementing to the other classes");
		System.out.println("5. It becomes easy for the user to add more methods to the Interface without breaking the head");
		System.out.println("6. So Ultimately it becomes easy, short n simple for the user to implement methods and code.......... \n");
	}
}
public class Concept_Interface_DefaultMethods 
{
	public static void main(String[] args)
	{
		introduce_default id = new introduce_default();
		id.show();
		
		
		Dhanbad d1 = new Dhanbad();
		Shankara.test(); 				// update 25-07-2022
		d1.show();
		d1.EmergencyNo();
		d1.autoFare();
		d1.nearestUnder(5);
	}
}
