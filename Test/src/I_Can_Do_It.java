
public class I_Can_Do_It 
{
	public static void canDoit(int x)
	{
		if(x==0)
			return;
		System.out.println("I can Do it");
		canDoit(x-1);
	}
	public static void main(String[] args) 
	{
		canDoit(1000000);
	}
}
