package Practise_OOPs;
interface Hello
{
	void kemcho();
	void mojame();
}
interface Namaste extends Hello
{
	void aurSab();
	void badhiya();
}
class MyMain implements Namaste
{

	@Override
	public void kemcho() {
		System.out.println("Kemcho ");
		
	}

	@Override
	public void mojame() {
		System.out.println("Mojame ");
		
	}

	@Override
	public void aurSab() {
		System.out.println("aur Sab");
		
	}

	@Override
	public void badhiya() {
		System.out.println("Sb Badiya Ba");
		
	}
	
}
public class practise_objectOfInterface 
{
	public static void main(String[] args) 
	{
		Hello obj = new MyMain();
		obj.kemcho();
		obj.mojame();
	}
}
