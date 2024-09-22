package concept_methods_threads;
class infoJoin
{
	infoJoin()
	{
		System.out.println("1. This method join() is a method of Thread Class.");
		System.out.println("2. Whenever it is implemented, the object that is initiated with join method is allowed to fully complete its task.");
		System.out.println("3. And Then the third method is allowed to start and implement. ");
		System.out.println("4. Java me thread ka order ka koi priotity ya importance nhi hota woh kisi ko v chala deta h. Lekin user agar ye chahta h ki kuch threads ka ek priority maintain rhe,");
		System.out.println("5. Toh woh kuch methods are commands ki madad leta h taki woh threads execution ko control kr ske, ar unme se hi ek h join() method.");
		System.out.println("-----------------------JOIN METHOD IN JAVA (CODE WITH HARRY)--------------------------");
		System.out.println("1. The join() method in Java allows one thread to wait until the execution of some other specified thread is completed.\r\n"
				+ "2. If t is a Thread object whose thread is currently executing, then t.join() causes the current thread to pause execution until t's thread terminates.\r\n"
				+ "3. Join() method puts the current thread on wait until the thread on which it is called is dead.");
	}
}
class JoinMethod extends Thread
{
	public void run()
	{
		for(int i=1 ; i<=1000000 ; i++)
		System.out.println("Good Morning Ujjwal");
	}
}
class JoinMethod2 extends Thread
{
	public void run()
	{
		for(int i=1 ; i<=100000 ; i++)
		System.out.println("Good Afternoon Ujjwal");
	}
}
public class method_join 
{
	public static void main(String[] args) 
	{
		infoJoin inf = new infoJoin();
		
//		comment out the below code to see the execution but pehle padh lo!
		
//		JoinMethod jm1 = new JoinMethod();
//		JoinMethod2 jm2 = new JoinMethod2();	
//		jm1.start();
//			try 
//			{
//				jm1.join();
//			} 
//			catch (InterruptedException e)
//			{
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		jm2.start();
		
	}
}

