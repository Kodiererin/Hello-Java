package concept_methods_threads;
// explicitly kills a thread
public class method_stop implements Runnable
{
	static Thread t;
	@SuppressWarnings("deprecation")
	public void run()
	{
		System.out.println("Running");
		t.stop();
		System.out.println("Learn Java");
	}
	public static void main(String[] args) 
	{
		method_stop k1 = new method_stop ();
		t = new Thread(k1);
		t.start();
	}
}
