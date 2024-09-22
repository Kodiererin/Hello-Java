// Here we are implementing Priority and Thread(Runnable R , String s)  ~ example is from the book
package concept;
class info
{
	info()
	{
		System.out.println("Hello Ujjwal, Lets See constructor known as Thread(Runnable R , String s)");
		System.out.println("1. Thead Ek class aur interface v H, jisme aap overload, extend krke uske elements ko override, implements krke use kr skte ho ");
		System.out.println("2. Aise bohot saare constructors pehle se bne hue h by default, toh aap kya krte ho ki ");
		System.out.println("3. Aap  is constructor ko overload krne waale ho, isme ky a hoga ki");
		System.out.println("4. Aap ek object banate ho ar ek string jo ki us thread ko ek naam de deta h ar fir aap use istmal krte ho.");
		System.out.println("5. Main concept iske peeche abhi v unknown h lekin jha tk mujhe pta h ki aap constructors ko overload krte ho...");
		System.out.println("Baki kuch nya pta chala toh bta dunge!");
		
	}
}
class UjjwalTestConstructor implements Runnable
{	
	public void run()
	{
		System.out.println(Thread.currentThread()+"Hello Ujjwal");
//		System.out.println();
	}
}
class by_using_Runnable_Interface
{
	public static void main(String[] args) 
	{
		info i = new info();
		System.out.println("----------------------------------------------------");
		UjjwalTestConstructor obj = new UjjwalTestConstructor();
		Thread t1 = new Thread(obj , "Ujjwal");
		System.out.println(t1.getPriority());
		t1.start();
		System.out.println("The Thread id is "+t1.getId());
		System.out.println("THe Thread Name is "+t1.getName());
	}
}