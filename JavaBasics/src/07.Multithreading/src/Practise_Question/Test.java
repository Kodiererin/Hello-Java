package Practise_Question;
class Test19 extends Thread
{
	Test19(Runnable r)
	{
		System.out.println("Walla Habibi kem cho ");
		System.out.println("Walla Habibi kem cho ");
		System.out.println("Walla Habibi kem cho ");
		System.out.println("Walla Habibi kem cho ");
		System.out.println("Walla Habibi kem cho ");
		System.out.println("Walla Habibi kem cho ");
		System.out.println("Walla Habibi kem cho ");
		System.out.println("Walla Habibi kem cho ");
		System.out.println("Walla Habibi kem cho ");
		System.out.println("Walla Habibi kem cho ");
	}
	public void run()
	{
		System.out.println("Runnable R Thread is Working");
		System.out.println("Runnable R Thread is Working");
		System.out.println("Runnable R Thread is Working");
		System.out.println("Runnable R Thread is Working");
		System.out.println("Runnable R Thread is Working");
	}
}
class Test15 implements Runnable
{
	public void run()
	{
		System.out.println("Runnable R Thread is Working implementes wala function");
		System.out.println("Runnable R Thread is Working implementes wala function");
		System.out.println("Runnable R Thread is Working implementes wala function");
		System.out.println("Runnable R Thread is Working implementes wala function");
		System.out.println("Runnable R Thread is Working implementes wala function");
		System.out.println("Runnable R Thread is Working implementes wala function");
	}
}
public class Test 
{
	public static void main(String[] args) 
	{
		Test15 t15 = new Test15();
			Thread gun = new Thread(t15);
			gun.start();
		
		
		Test19 t19 = new Test19(gun);
//			Thread gun2 = new Thread(t19);
		gun.start();
//		Test19 t16 = new Test19();
//		t16.start();
		
	}
}
