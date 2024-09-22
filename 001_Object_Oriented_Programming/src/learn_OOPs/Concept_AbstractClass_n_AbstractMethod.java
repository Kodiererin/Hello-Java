package learn_OOPs;
abstract class Ujjwal01
{
	public Ujjwal01()
	{
		System.out.println("Ujjwal, Hello");
	}
	public void helloJi()
	{
		System.out.println("Hello Ujjwal");
	}
	abstract public void takeRisk();
	abstract public void acheiveIt();
}
class aim extends Ujjwal01
{
	public void takeRisk()
	{
		System.out.println("Take Risks Ujjwal");
	}
	public void acheiveIt()
	{
		
	System.out.println("Get Set Acheive");
	}
}
abstract class access extends Ujjwal01
{
	public void hello()
	{
		System.out.println("You can Do It");
	}
	abstract void sayIt();
}
public class Concept_AbstractClass_n_AbstractMethod
{
	public static void main(String[] args)
	{
		System.out.println("1. Abstract Methods must be in Abstract class");
		System.out.println("2. Abstract class just provide a base for common problem like turning phone on, off, starting an app");
		System.out.println("3. Method Overriding is an important use in Abstract class ");
		System.out.println("4. Try to connect the dots(class n methods) by mind then only you could understand it \n");
		aim u1 = new aim();
		u1.helloJi();
		u1.takeRisk();
		u1.acheiveIt();
	}
}