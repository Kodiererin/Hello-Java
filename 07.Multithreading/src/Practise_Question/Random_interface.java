package Practise_Question;
class Test03 implements Runnable
{
	public void show()
	{
		int i=1; 
		while(i<=1000)
		{
			System.out.println("Kemcho Ujjwal");
			i++;
		}
	}
	public void run()
	{
		int i=1; 
		while(i<=1000)
		{
			System.out.println("Hello Kumar, How are you");
			i++;
		}
	}
}

class Test04 implements Runnable
{
	public void show()
	{
		int i=1; 
		while(i<=1000)
		{
			System.out.println("Mojame");
			i++;
		}
	}
	public void run()
	{
		int i=1; 
		while(i<=1000)
		{
			System.out.println("Hello Ujjwal, How are you");
			i++;
		}
	}
}
//class Test08 extends Test04
//{
//	public void run()
//	{
//		int i=1 ;
//		while(i<=10000)
//		{
//			System.out.println("Hello Ujjwal Welcome to DNS");
//			i++;
//		}
//	}
//}
public class Random_interface 
{
	public static void main(String[] args) 
	{
		Test03 t1 = new Test03();
			t1.show();
		Thread gun = new Thread(t1);
			gun.start();
		
		Test04 t2 = new Test04();
			t2.show();
		Thread gun1 = new Thread(t2);
			gun1.start();
			
//		Test08 t8 = new Test08();
//		Thread gun03 = new Thread(t8);
//			gun03.start();
	}
}
