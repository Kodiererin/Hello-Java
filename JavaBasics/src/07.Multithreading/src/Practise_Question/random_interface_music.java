// perfect example to figure out how the multithreading is working and set out the difference and main point
//	between'em.................... so keep going and best of luck

package Practise_Question;
class Test11 implements Runnable
{
	public void run()
	{
		System.out.println("assman tera mera hua khab ki trah ruha rua");
		System.out.println("assman tera mera hua khab ki trah ruha rua");
		System.out.println("OOOO jayeg jha tu jayer paye whi mujhe vi paye saye ki tarah tu jaye");
		System.out.println("Sayira main sayra sayira tu saiyara ");
		System.out.println("Sitrao ki jahan me payenge tu yaara ");
	}
}

class Test12 implements Runnable
{
	public void run()
	{
		System.out.println(" TU jo mila toh yu hhua hogari puri");
		System.out.println("Adhuri................");
	}
}

public class random_interface_music 
{
	public static void main(String[] args) 
	{
		Test11 t11 = new Test11();
		Test12 t12 = new Test12();
		
		Thread t1 = new Thread(t11);
		Thread t2 = new Thread(t12);

		t1.start();
		t2.start();
	}
}
