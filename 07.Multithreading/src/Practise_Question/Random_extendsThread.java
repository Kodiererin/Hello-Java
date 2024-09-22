// yha pe package override ho rha h Test02 toh dekho kaise ho rha h! mza Aayega ar samajh aayega
package Practise_Question;
class Test01 extends Thread
{
	public void Test()
	{
		int i=1; 
		while(i<=1000)
		{
			System.out.println("Hello Ujjwal");
			i++;
		}
	}
	public void run()
	{
		int i=1; 
		while(i<=1000)
		{
			System.out.println("This is a thread class");
			i++;
		}
	}
}
class Test02 extends Thread
{
	public void Test()
	{
		int i=1; 
		while(i<=1000)
		{
			System.out.println("Hello Kumar, How are you");
			i++;
		}
	}
	public void run()
	{
		int i=1; 
		while(i<=1000)
		{
			System.out.println("This is a thread class 02");
			i++;
		}
	}
}
class Test07 extends Test02
{
	public void run()
	{
		int i=1; 
		while(i<=1000)
		{
			System.out.println("De Nobili School");
			i++;
		}
	}
}
public class Random_extendsThread 
{
	public static void main(String[] args) 
	{
		Test01 t1 = new Test01();
		Test02 t2 = new Test02();
		Test07 t7 = new Test07(); 
		t1.Test();
		t2.Test();
		t1.start();
		t2.start();
		t7.start();
	}
}
