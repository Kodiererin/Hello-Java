package Practise_Question;
class Question
{
	Question()
	{
		System.out.println("------------QUESTION FROM THE BOOK------------");
		System.out.println("Write a multithreaded Program where one thread shows a prime number and another thread shows \n an even number between 1 to 100. ");
		System.out.println("Declare a class having an integer variable. Only one thread at a particular instant o0f time performs its duty");
	}
}
class prime implements Runnable
{
	public void run()
	{
		System.out.println("The Prime Numbers Are ");
		int ctr=0;
		for(int i=1 ; i<=100 ; i++)
		{
			if(i%2 ==0 || i%3==0 || i%5==0 || i%7==0)
			{
				
			}
			else
			{
				System.out.print(i+" , ");
			}
		}
		System.out.println();
	}
}
class even implements Runnable
{
	public void run()
	{
		System.out.println("The Even Number are");
		for(int i=1 ; i<=100 ; i++)
		{
			if(i%2==0)
			{
				System.out.print(i+" , ");
			}
		}
	}
}
public class BookQuestion 
{
	public static void main(String[] args) 
	{
//		Question q = new Question();
		prime p1 = new prime();		
			Thread t1 = new Thread(p1);
		even e1 = new even();
			Thread t2 = new Thread(e1);
		t1.start();
			try {
				t1.join();
			} catch (InterruptedException e) { 
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		t2.start();
	}
}
