package Output;
public class j_Print_flag_HashFlag 
{
	public static void intro()
	{
		System.out.println("Hash (#) Flag");
		System.out.println("1. This flag's main moto is to addd a decimal point after a number");
		System.out.println("2. In numbers like octal and other special numbers it acts like some other");
		System.out.println("3. %d %o %X %e %E %f %a %A \n");
	}
	public static void hash_with_octalnSpecialno()
	{
		System.out.printf("%#o%n",123);
		System.out.printf("%#x", 1234);
		System.out.printf("%#x",1234);
		System.out.printf("%#X%n", 1234);
		System.out.printf("%#08x%n %n",1234);
	}
	public static void hash_with_DecimalNo()
	{
		System.out.printf("%.0f%n",12.34); 		//12
		System.out.printf("%#.0f%n",12.34);		//12.
		System.out.printf("%.0e%n",12.34);
		System.out.printf(".0e%n",12.34);			
	}
	public static void main(String[] args)
	{
		intro();
		hash_with_octalnSpecialno();
		hash_with_DecimalNo();
	}
}
