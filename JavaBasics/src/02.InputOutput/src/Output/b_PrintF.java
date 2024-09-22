package Output;
public class b_PrintF 
{
//	1. First Print Statement
//	Observe the Spaces and dont Confuse
//	%n sign is used to go to the next line
//	Comments show the output that you will get 
	public static void show1()
	{
		int num = 100;
		int num1 = 10000;
		float num2 = 100f;
		System.out.printf("Hello Ujjwal The Numbers are %d %d %f %n",num,num1,num2 );
//		Hello Ujjwal The Numbers are 100 10000 100.000000 ~> Output
		
		double U = 3.1243;
		System.out.printf("Double value is Upto %.2f%n",U); // Double value is Upto 3.12
		System.out.printf("Float output in Double value (Jugad) %f",U); 
		//Float output in Double value (Jugad) 3.124300		
	}
//	2. Second Program to get some extra points
//	%%  allows to get %symbol 
//	you can also get the %symbol by char c = '%' and  then by %c s
	public static void show2()
	{
		char c = 'U';
		String u = "Ujjwal";
		int percentage = 82;
		char p = '%';
		System.out.printf("Hello My name is %s and My first Letter of my name is %c and My Percentage is %d%% %n",u , c , percentage);
//		Hello My name is Ujjwal and My first Letter of my name is U and My Percentage is 82% 
		System.out.printf("Hello My name is %s and My first Letter of my name is %c and My Percentage is %d%c",u , c , percentage , p);
//		Hello My name is Ujjwal and My first Letter of my name is U and My Percentage is 82%
	}
//	3. This program emphasies on the space between arguments and space.
//		so Be careful!.................................................
	public static void main(String[] args)
	{
		int num = 87;
		String name = "Ujjwal";
		System.out.printf("%s     Your percentage is          %d%n",name,num);
//		Ujjwal     Your percentage is          87
		System.out.printf("%sYour Percentage is%d%n",name,num);
//		UjjwalYour Percentage is87
		System.out.printf("%sYour Percentage is%d", name,   num);
//		UjjwalYour Percentage is87
	}
}
