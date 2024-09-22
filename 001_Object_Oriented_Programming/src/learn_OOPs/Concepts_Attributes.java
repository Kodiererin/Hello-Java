package learn_OOPs;
class Test5
{
	String x; // these are the attributes 
	int y;// these are the attributes
	
	public void show()
	{
		System.out.println("Your Name is "+x);
		System.out.println("Your Employee id is "+y);
	}
}
public class Concepts_Attributes 
{
	public static void main(String[] args)
	{
		Test5 tt = new Test5();
		tt.x = "Ujjwal Kumar";
		tt.y = 99;
		tt.show();
	}
}
