// my solution of java thread constructors(runable r, string name)

class concept_constructor_thread_runnable implements Runnable
	{
        public void run()
        {
        	System.out.println("I am thread of runnable interface");

        	public static void main(String[] args) 
        	{
		        // creating an object of the concept_constructor_thread_runnable class
		        Runnable newR = new concept_constructor_thread_runnable();
		        // creating an object of class thread suing thread
		        Thread t1 = new Thread(newR,"ujjwal");
		        t1.start();
		        System.out.println("The name of the thread is: "+t1.getName());
	        }
        }
	}
