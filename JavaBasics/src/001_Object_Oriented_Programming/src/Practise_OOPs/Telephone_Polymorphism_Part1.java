package Practise_OOPs;
abstract class Ujjwal_Telephone
{
	abstract void call();
	abstract void lift();
	abstract void disconnect();
}
class old_Telephone extends Ujjwal_Telephone
{
	public void call()
	{
		System.out.println("Calling");
	}
	public void lift()
	{
		System.out.println("Lift");
	}
	public void disconnect()
	{
		System.out.println("Call Disconnected ");
	}
}
public class Telephone_Polymorphism_Part1
{
	public static void main(String[] args) 
	{
		old_Telephone oldT = new old_Telephone();
		oldT.call();
		oldT.disconnect();
	}
}
