package Practise_Question;

class Test13 implements Runnable
{
	public void run(int x)
	{
		for(int i=1 ; i<=10 ; i++)
		{
			System.out.println(i+ "x " +x+" = " +(i*x));
		}
	}
	
	public void run()
	{
		System.out.println("Kem Cho Moja me");
		System.out.println("Kem Cho Moja me1");
		System.out.println("Kem Cho Moja me2");
		System.out.println("Kem Cho Moja me3");
		System.out.println("Kem Cho Moja me4");
		System.out.println("Kem Cho Moja me5");
	}
}
class Test14 implements Runnable 
{
	public void run()
	{
		for(int i=1 ; i<=10 ; i++)
		{
			System.out.println("arguments_in_interface_class"+i);
		}
	}
}
public class arguments_in_interface_class
{
	public static void main(String[] args) 
	{
		Test13 t13 = new Test13();
		Test14 t14 = new Test14();
		
		Thread t1 = new Thread(t13);
		Thread t2 = new Thread(t14);
		
		t1.start();
//		t1.start();				// error de dega kyuki aap multiple times start() method ko call nhi kr skte, as as hi baar method call hota h dusri baar nhi!
//		t1.start(2); // argument wala part ek baar dekh lena!
		t2.start();
	}
}
