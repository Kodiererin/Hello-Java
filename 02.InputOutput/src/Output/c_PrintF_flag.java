package Output;
public class c_PrintF_flag 
{
	public static void show()
	{
/*		Composition of FlagF
 * 		%[Argument_index$][Flag][Width][.precision]f
 * 		flag = to move the cursor left or right to print from it.
 * 		argument = which argument you are going to use.
 * 		precison = how many number after decimal.
 * 		f		 = data conversion type. 							*/
		double num = 10.124;
		System.out.printf("%f%n",num);					// 10.124000
//		%f has a default return size of upto 6 decimal places.
//		%f %g %G %e has a default return type size of 6 decimal places.
	}
//	%n moves the cursor to the next Line
	public static void show2()
	{
		double num1 = 12.345678;
		System.out.printf("%.0f%n",num1);				// 12
		System.out.printf("%.3f%n",num1);				// 12.346
		System.out.printf("%.8f%n",num1);				//12.34567800
	}
	public static void show3()
	{
		String str = "Ujjwal";
		int num = 98;
		char a = 'U';
		System.out.printf("%.2S%n",str); 				// UJ
		System.out.printf("%.3b%n",true);				// tru
		System.out.printf("%.2h%n",str);				// 97
		System.out.printf("%.3d%n",num);				// no output , error	
		System.out.printf("%.3n%n",a);					// no output , error	
	}
	public static void main(String[] args)
	{
		show();						// for introduction
		show2();					// for working
		show3();
	}
}
