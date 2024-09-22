package Output;
public class f_Print_flag_Spaceflag 
{
	public static void spaceFlagInfo()
	{
		System.out.println("1. This Flag adds a padding of one space before the positive Numbers.");
		System.out.println("2. The positive numbers will be ignored if the space falgs argument index is negative");
		System.out.println("3. Works with : %d , %o , %x , %X , %e , %E , %f , %g , %G , %a, %A \n");
		System.out.println("Warning +(Plus) Flag and Space Flag cannot be combined. So be aware.");
	}
	public static void spaceFlag()
	{
		System.out.printf("          %d%n",123);						// 10 spaces have been done
		
		String name = "     Ujjwal";
		System.out.printf("%s%n",name);									// Be careful, dont add space after/before  the String
		System.out.printf("%   +d,%n",123);								// no output due to plus flag...
	}
	public static void main(String[] args) 
	{
		spaceFlagInfo();
		spaceFlag();
	}

}
