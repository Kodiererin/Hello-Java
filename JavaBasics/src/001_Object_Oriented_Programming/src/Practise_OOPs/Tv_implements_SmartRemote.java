package Practise_OOPs;
interface tv extends remote
{
	void meraTv();
}
class UjjwalTV implements tv
{
	public void meraTv()
	{
		System.out.println("Welcome Ujjwal To LgAQ");
	}
	public void powerOn()
	{
		System.out.println("Powering On Tv");
	}
	public void volumeUp()
	{
		System.out.println("Voluming Up The TV");
	}
	public void channelChange()
	{
		System.out.println("Changing the channel");
	}
	public void volumeDown()
	{
		System.out.println("Voluming down the TV");
	}
	public void volumeOff()
	{
		System.out.println("ALright Amigo, Powering Off");
	}
	public void powerOff() 
	{
		System.out.println("Powering off the TV");
	}
}
class Tv_implements_SmartRemote 
{
	public static void main(String[] args) 
	{
		UjjwalTV u=  new UjjwalTV();
		u.meraTv();
		u.powerOn();
		u.powerOn();
		u.channelChange();
		u.volumeDown();
		u.powerOff();
	}
}
