package concept;

class infoMulthreading01
{
	infoMulthreading01()
	{
		System.out.println("1. This is a Multithreading by Extending thread class");
		System.out.println("2. Here we play with Thread class which has been made by default");
		System.out.println("3. We extend the Thread class and then we create a run method. Remember the run() method is run is compulsary to make a Multithreading by Extending thread class");
		System.out.println("4. In main method, we make sure that the objected created is attahced by start() method to start threading");
		System.out.println("5. As mentioned earlier, the start() method is also fixed by the developer to start the threading");
		System.out.println("6. Here start() automatically calls run() method and starts threading.......................................");
	}
}

class testThread extends Thread
{
	public void run()
	{
		int i=1 ;
		while(i<=4000)
		{
			System.out.println("Testing thread   1 \n");
			i++;
		}
	}
}

class testThread2 extends Thread
{
	public void run()
	{
		int i=1; 
		while(i<=4000)
		{
			System.out.println("Testing thread   2");
			i++;
		}
	}
}
public class concept_by_Extending_Thread_Class
{
	public static void main(String[] args) 
	{
		infoMulthreading01 info = new infoMulthreading01();       // comment out to see the result.
//		testThread t1 = new testThread();
//		testThread2 t2 = new testThread2();
//		t1.start();
//		t2.start();
	}
}
