package learn_OOPs;
interface Bus
{
	int engineNumber = 12345;			// variables cannot be updated/modified/changed
	void speedLimit();
	void EngineNumber();
}
interface BusHulia
{
	void colour(String colour);
	void DriverName(String Driver);
}
class MoBus implements Bus,BusHulia                     // interface -> template
{															// interface -> implement krta h jo...............
	void intro()		// ye dhyan dena this is not an interface								
	{
		System.out.println("Welcome to MOBUS");
	}	
	public void lightsColour()								// all the "Implement Method" must be declared public 
	{
		System.out.println("Lights Colour is Yellow");
	}
	public void speedLimit()
	{
		System.out.println("The Maximum Speed of the bus 40Km/hr");
	}
	public void EngineNumber()
	{
		System.out.println("Engine Number is "+this.engineNumber);
	}
	public void colour(String x)
	{
		System.out.println("The Bus colour is "+x);
	}
	public void DriverName(String x)
	{
		System.out.println("Drivr Name = "+x);
	}
	
}
class Introduce														// chaliye samajhte h iss topic ko
{
	Introduce()
	{
		System.out.println("Interfaces ");
		System.out.println("1. Interfaces are like templates that can be implemented multiple times \");");
		System.out.println("2. Abstract cannot be used in multiple classes");
		System.out.println("3. In Interfaces Variables Declared cannot be modifid or Updated");
		System.out.println("4. Multiple Interfaces are accesible with class or classes");
		System.out.println("5. In Interface all the methods will be public ");
		System.out.println("6. In Interface Parent class -> child class -> child class (can be extended )");
		System.out.println("7. In Interface Parent class -> 1) child class & 2) Child class (can be extended )");
		System.out.println("8. Interface is inherited in a class by \"implements\" keyword");
		System.out.println("9. Remember \"Interface \" and \"implements \" keyword ");
		System.out.println("10. Both keywords are useful...............\n");
	}
}
public class Concept_Interfaces 
{
	public static void main(String[] args)
	{
		Introduce I = new Introduce();					// introduction
		MoBus m1 = new MoBus();							// object created for MoBus class to use its interface methods 
		m1.intro();
		m1.lightsColour();
		m1.speedLimit();
		m1.EngineNumber();
		m1.colour("Yellow");
		m1.DriverName("Ramu Kaka");
	}
}
