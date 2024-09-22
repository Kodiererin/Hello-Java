package Package1;

public class WorldAccebility_Public 
{
	public void show()
	{
		System.out.println("This is a Method show of the first package.");
	}
	public int calculate(int x , int y)
	{
		return x+y;
	}
	public static void main(String[] args) 
	{
		WorldAccebility_Public wa1 = new WorldAccebility_Public ();
		wa1.show();
		System.out.println("The Sum of 67 and 76 is "+wa1.calculate(67, 76));
	}
}
