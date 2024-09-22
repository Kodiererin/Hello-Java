package Output;
public class e_Print_flag_plusFlag 
{
	public static void intro()
	{
		System.out.println("%+ Plus Flag");
		System.out.println("1. Plus flag gurantees that a plus sign will appear before a number in the output");
		System.out.println("2. The Plus flag will be ignored if the Number/negative is negative");
		System.out.println("3. Works with : %d , %o , %x , %X , %e , %E , %f , %g , %G , %a, %A \n");
	}
	public static void plusFlag()
	{
		System.out.printf("%+d%n",123);
		System.out.printf("%+d%n",-123);
		System.out.printf("%+f%n",1234.34);
		System.out.printf("%+f%n",-1234.34);
	}
	public static void PlusWidth_Flag()
	{
		System.out.println("1. This method is create for showing that the plus sign also carry a space");
		System.out.println("2. So be aware so that you check before using Width and plus flag");
		System.out.printf("%+10d%n",1234); 				//_____+1234 (Plus sign also takes space so be aware)
	}
	public static void main(String[] args)
	{
		intro();
		plusFlag();
		PlusWidth_Flag();
	}
}
