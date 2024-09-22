package learn_OOPs;
class Namuna
{
	int d =10;
	private int pr = 100;
	protected int pro = 1000;
	public int pub = 101010;
}
class ujjwal extends Namuna
{
	
}
public class concept_AccessModifer 
{
/* x is a Private Method.
 * y is a Protected Method.
 * m is a default method.
 * n is a public method
 */
	private static int x = 5;
	protected static int y = 10;
	static int m = 15;
	public static int n = 20;
	
//	implementing all the methods with specific access modifiers into same class
	
		public static void main(String[] args)
		{
			System.out.println(x);
			System.out.println(y);
			System.out.println(m);
			System.out.println(n);
		}
	
}
