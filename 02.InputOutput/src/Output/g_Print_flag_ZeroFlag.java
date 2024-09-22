package Output;
public class g_Print_flag_ZeroFlag 
{
	public static void ZeroFlagInfo()
	{
		System.out.println("1. Zero 0 flag.");
		System.out.println("2. This flag adds Zero to the Number before it.");
		System.out.println("3. Works with : %d , %o , %x , %X , %e , %E , %f , %g , %G , %a, %A");
		System.out.println("4. Note : The %0 flag must have a with modifier associated with it.");
		System.out.println("5. If there is no width modified then there will be an error!.............\n");
	}
	public static void zeroFlag()
	{
		System.out.printf("%02d%n",1);				// Here 02 decides the width of the 0, if it is less then number then 0 is added else, 0 is not added.
		System.out.printf("%02d%n",100);
//		System.out.printf("%07.2f%n",123.12);
		System.out.printf("%07.2f%n",-123.12);
//		String name = "Ujjwal";
//		System.out.printf("%01s%n",name);			// no output on String.
	}
	public static void zeroFlagErrors()
	{
		System.out.println("\nThis method is created for errors.");
		System.out.printf("%-0.7d%n",-123); 							// error will be thrown.
		System.out.printf("%0d%n",123);									// error will be thrown...
	}
	public static void main(String[] args)
	{
		ZeroFlagInfo();
		zeroFlag();
		zeroFlagErrors();
	}
}
