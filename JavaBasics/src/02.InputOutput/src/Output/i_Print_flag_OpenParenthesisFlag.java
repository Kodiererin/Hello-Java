package Output;
public class i_Print_flag_OpenParenthesisFlag 
{
	public static void intro()
	{
		System.out.println("Open Parenthesis Flag \"(\" Flag");
		System.out.println("1. This number adds a Number in a parenthesis ");
		System.out.println("2. Flag ignores +ve Numbers and Prints Parenthesis of negative Numbers ");
		System.out.println("3. Works with %d %o %x %X %e %E %f %g %G \n");
	}
	public static void flag_OctalInSpecialNo()
	{
		System.out.printf("%(d%n", 123);			//123
		System.out.printf("%(d%n",-123);			//(123)
		System.out.printf("%(.2f%n",234.12); 		//234.12
		System.out.printf("%(08d%n",-12345);		//012345
	}
	public static void main(String[] ujjwal)
	{
		intro();
		flag_OctalInSpecialNo();
	}
}
