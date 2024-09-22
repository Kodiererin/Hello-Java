package concept_methods_threads_sleep_method;
class info
{
	info()
	{
		System.out.println("-----------SLEEP CLASS------------------");
		System.out.println("1. sleep() class is a another class in Java that enables us to pause a method for a while");
		System.out.println("2. This is a static method.");
		System.out.println("3. sleep() method returns void  ");
		System.out.println("4. Parameters passed in sleep() method is");
		System.out.println("        public static void sleep(long milliseconds) throws Interrution Exception");
		System.out.println("        public static void sleep(long milliseconds , int name) throws Interrupted Exception");
		System.out.println("5. sleep() is a Static method so it is called by class name");
	}
}
class sleepTest1 extends Thread
{
	public void run()
	{
		for(int i=1 ; i<=5 ; i++)
			System.out.println("Ujjwal Kemcho");
	}
}
class sleepTest2 extends Thread
{
	public void run()
	{
		for(int i=1 ; i<=5 ; i++)
			System.out.println("Mojame Mota Bhai");
	}
}
public class method_sleep {

	public static void main(String[] args) 
	{
		sleepTest1 st1 = new sleepTest1();
		sleepTest2 st2 = new sleepTest2();
		st1.start();
		try
		{
			Thread.sleep(999);		// sleep() is a Static method so it is called by class name
		} 
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		st2.start();
	}

}

