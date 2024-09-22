package Package1;
class Test01 
{
	public int pub = 10;
	int def = 100;
	protected int pro = 1000;
	private	int pri = 100000;
}
class Test02 extends Test01
{
	Test02()
	{
		System.out.println("This is a Project in which Some Packages are created to demonstrate the Access Modifiers. \n");
		System.out.println("Public Attribute "+pub);
		System.out.println("Default Attribute "+def);
		System.out.println("Protected Attribute "+pro);
//		System.out.println("Private Attribute is not accessible outside the class"+pri); // Private is also not applicable for private attribute.
		System.out.println("Still The Private Access Modifier is not accessible in the Extended class");
	}
}
public class TestAccesModifier01
{
	public static void main(String[] args) 
	{
		Test01 test = new Test01();
		System.out.println("This is a Project in which Some Packages are created to demonstrate the Access Modifiers. \n");
		System.out.println("Public Attribute "+test.pub);
		System.out.println("Default Attribute "+test.def);
		System.out.println("Protected Attribute "+test.pro);
		System.out.println("Private Attribute is not accessible outside the class");
		
		for(int i=1 ; i<=100 ; i++)
		{
			System.out.print("-");
		}
		
		System.out.println("\nAnother class is created that has been extended to show some propertie (which right now I also Dont know) \n");
		Test02 test2 = new Test02();
//		Creating a variables for the Package2 Classes..........
		
		
	}
}