package concept;

// my solution of java thread constructors(runable r, string name)

class myThread implements Runnable
	{
        public void run()
        {
        	System.out.println("I am thread of runnable interface");
        }
	}
class concept_constructor_thread_runnable{

        	public static void main(String[] args) 
        	{
		        // creating an object of the concept_constructor_thread_runnable class
		        Runnable newR = new myThread();
		        // creating an object of class thread suing thread
		        Thread t1 = new Thread(newR,"ujjwal");
		        t1.start();
		        System.out.println("The name of the thread is: "+t1.getName());
	        }
        }
