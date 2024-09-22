package concept_methods_threads_sleep_method;
import java.io.*;
import java.lang.*;
// from the BOOK
class infoInterrupts1
{
	infoInterrupts1()
	{
		System.out.println("interrupts() ~ As the name suggests, ye method ka kaam h ki jo method so gya h use utha dena");
		System.out.println(" Ye method bolta h ki woh sleep() method ko sone nhi dega, ");
	}
}
class Book implements Runnable
{
	public void run()
	{
		try
		{
			Thread.sleep(200000);	// interrupts ke kaaran jitna time badha lo woh ruk hi jayega
		}
		catch(InterruptedException e)
		{
			for(int i=1 ; i<=10 ; i++)
			{
				System.out.println("Kem Cho Ujjwal");
			}
		}
		System.out.println(Thread.currentThread());
	}
}
public class concept_sleep_interrupts 
{
	public static void main(String[] args) 
	{
		infoInterrupts1 inf1 = new infoInterrupts1()	;
		Book obj = new Book();
		Thread gun = new Thread(obj , "Ujjwal");
		gun.start();
		gun.interrupt();
	}
}
