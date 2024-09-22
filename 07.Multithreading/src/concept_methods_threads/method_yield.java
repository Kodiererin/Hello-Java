package concept_methods_threads;
//not so important thread
// yield() method kuch nhi bs aanewala thread ko aane keliye active kr deta h toh bs yhi h
// priority() method bhi use krke ise overtake kr deta h!
class x implements Runnable
{
	public void run()
	{
		System.out.println("Thread is running"+Thread.currentThread());
		Thread.yield();
		System.out.println("Thread 2 is running"+Thread.currentThread());
	}
}
public class method_yield 
{
	public static void main(String[] args) 
	{
		x obj = new x();
		Thread t1 = new Thread(obj);
		t1.start();
		t1.interrupt();
		
	}
}
