package Output;
public class k_Print_argument_Index 
{
	public static void introArgumentIndex01()
	{
		System.out.println("This is a Argument Index 1");
		System.out.println("Argument index Starts with a number followed with $");
		System.out.println("1. Its main moto is to find the index given and execute it \n");
	}
	public static void numberdollarIndex()
	{
		System.out.printf("%s %s %S %n","1","2","3");
		System.out.printf("%1$s %1$s %1$s %n","1","2","3");
		System.out.printf("%3$s %2$s %1$s %n","1","2","3");
		System.out.printf("%s %3$s %s %n","1","2","3");
		
		System.out.println("Overall, it just finds the index from the set of strings and prints it \n \n");
	}
	public static void introArgumentIndex02()
	{
		System.out.println("This is an argument Index 2");
		System.out.println("Argument Index \"<\" represents the Left One String to print");
		System.out.println("");
	}
	public static void greaterIndex()
	{
		System.out.printf("%s%s%s%n","1","2","3");
		System.out.printf("%s %<s %<s %n","1","2","3");
		System.out.printf("%<s%s%s%s%n","1","2","3");		// error will come up 
		System.out.printf("%$2s %s %<s %n","1","2","3");		// error will come up
	}
	public static void main(String[] args) 
	{
		introArgumentIndex01();
			numberdollarIndex();
			
		introArgumentIndex02();
			greaterIndex();		
	}

}
