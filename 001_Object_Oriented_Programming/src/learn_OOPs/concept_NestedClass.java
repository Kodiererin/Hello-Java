package learn_OOPs;
class outsideClass
{
	outsideClass()
	{
		System.out.println("Hello, I am a Constructor of outside class");
	}
	static void info()
	{
		System.out.println("This is a Small Example of Nested Class.");
		System.out.println("Nested Class are of two types");
		System.out.println("1. Static Nested Class ~ Nested Classes that are declared static are called static nested class");
		System.out.println("2. Inner Class ~ An Inner class is a non static static nested class ");
		/*				class OuterClass
						{
							...
    					class NestedClass
    					{
        					...
    					}
					}
		 * 
		 */
	}
	class insideClass
	{
		insideClass()
		{
			System.out.println("Hello, I am a constructor of Inside Class");
		}
	}
	static class newInsideClass
	{
		newInsideClass()
		{
			System.out.println("Hello, I am a constructor of Static Inside Class");
		}
	}
}
public class concept_NestedClass 
{
	public static void main(String[] args) 
	{
		outsideClass.info();
//		
		System.out.println();
		outsideClass o = new outsideClass();
		outsideClass.insideClass obj1 = o.new insideClass();
		outsideClass.newInsideClass obj2 = new outsideClass.newInsideClass();
	}
	
}
