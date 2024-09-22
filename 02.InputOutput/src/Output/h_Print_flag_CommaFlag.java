package Output;
public class h_Print_flag_CommaFlag 
{
	public static void intro()
	{
		System.out.println("Comma Flag \" , \" ");
		System.out.println("1. Comma FLag works as a group seperator.");		
		System.out.println("2. It divides the numbers in One's Hundreds' thousands etc... eg: 1,00,000 ,, 1,100");
		System.out.println("3. Comma Flag(,) is also counted in width ");
		System.out.println("4. Works With %d , %e , %E , %f , %g , %G\n");
	}
	public static void CommaFlag()
	{
		System.out.printf("%,d%n",123);
		System.out.printf("%,d%n",1235);
		System.out.printf("%,f%n",1234.11);
	}
	public static void kripyaDhyanDe()
	{
		System.out.println("\nPlease Note When you use \"0 flag then 0 will not be encountered in comma flag\"");
		System.out.printf("%,08d%n",1234);		//0001,234
		System.out.printf("%,015d%n",1234);		//00000000001,234
	}
	public static void main(String[] args)
	{
		intro();
		CommaFlag();
		kripyaDhyanDe();
	}
}
