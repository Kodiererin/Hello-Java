package Practise_Question;
class Test09 implements Runnable
{
//	public static void run()		 Run() method cannot be static 
	public void run()
	{
		int i=1 ;
		while(i<=10000)
		{
			System.out.println("Kem Cho Ujjwal");
			i++;
		}
		System.out.println("---------------------------------------------");
	}
}

class Test10 implements Runnable
{
//	public static void run()	 run() method cannot be static
	public void run()
	{
		int i=1 ;
		while(i<=10000)
		{
			System.out.println("Moja Me");
			i++;
		}
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++=");
	}
}

public class random_interfaceExperiment 
{
	public static void main(String[] args) 
	{
		Test09 t9 = new Test09();
			Thread gun1 = new Thread(t9);
			gun1.start();
		Test10 t10 = new Test10();
			Thread gun2 = new Thread(t10);
			gun2.start();
	}
}
