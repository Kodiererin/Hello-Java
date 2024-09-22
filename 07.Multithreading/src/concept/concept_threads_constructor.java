package concept;
class infoConstructorThread
{
	infoConstructorThread()
	{
		System.out.println("Constructors in Thread");
		System.out.println("This is a cool feature in java where we can play with constructors.");
		System.out.println("We can give name to the constructors, know what is the thread number and so on............");
		System.out.println(" As Suggested Code With harry we must know some names of the constructors");
		System.out.println(" 1. Thread()   \n2. Thread(String name)(By this we can set name to a thread)");
		System.out.println(" 3.Thread(Runnable r)(Bit confused regarding this although you can implement this in interface thread class)   \n4. Thread(Runnable r , String x) )");
	}	
}
class createConstructor1 extends Thread
{
	createConstructor1(String name)
	{
		super(name);
	}
	public void run()
	{
		int x = 53;
		System.out.println("Welcome to Run Function");
	}
}	
class createConstructor2 extends Thread
{
	createConstructor2(Runnable r)
	{
		super(r);
	}
	public void run()
	{
		int m = 45;
		System.out.println("Welcome to Run2 Function");
	}
}
public class concept_threads_constructor
{
	public static void main(String[] args) 
	{
		infoConstructorThread inf = new infoConstructorThread();
		createConstructor1 cs = new createConstructor1("Ujjwal");
		System.out.println("The Name of the thread is "+cs.getName());
		System.out.println("The Id of the Thread is"+cs.getId());
		cs.start();
		
//		createConstructor2 cs2 = new createConstructor2('U');
	}
}