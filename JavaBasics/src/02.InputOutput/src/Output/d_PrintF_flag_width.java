package Output;
public class d_PrintF_flag_width 
{
	public static void intro()
	{
		System.out.println(" 1. WIDTH is the minimum number of characters to be \n 2. to be written to the output \n 3. and it will always be non negative");
		System.out.println("");
	}
	public static void show1()
	{
//		width is presented by %(num)d;
//		(num) represents the number of space you want to add
//		if the number/string is more than the space width then , width is ignored.
//		width cannot be negative.
		String name = "Ujjwal";
		System.out.printf("%10s%n",name);				//____Ujjwal (_ represents the space)
		
		double num = 54.34465;
		System.out.printf("%10.4f%n",num);				//____54.3447
		
		System.out.printf("%-10s%10f%n",name,num);		// Ujjwal_____54.344650
//		negative sign prints the any datatype variable from the right to left instead to left to right
		System.out.println("negative sign prints the any datatype variable from the right to left instead to left to right");
	}
	
	public static void show2()
	{
		System.out.println("This method is created to use the negative width ");
		int roll = 53 ;
		String nameroll = "Roll number ";
		double num = 109.10;
		System.out.printf("%20s%n",nameroll);
		System.out.printf("%10d%n",roll);
		System.out.printf("%-20s%n",nameroll);
		System.out.printf("%-20d%n",roll);
		System.out.printf("%10f%n",num);
		System.out.printf("%100s%d%d%n",nameroll,roll,num);
	}
	public  static void main(String[] args)
	{
		intro();
		show1();
		show2();
	}
}
