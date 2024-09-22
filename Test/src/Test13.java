// this program was to test that what happens if the parameters orders are changed in the constructor.......
// so ..................................................................................................
class testu
{
	int x;
	String u;
	testu(int a , String b)
	{
		System.out.println("The First Data is "+a);
		System.out.println("The Second Data is "+b);
	}
	testu(String b , int a)
	{
		System.out.println("The First Data is "+b);
		System.out.println("The First Data is "+a);
	}
}
public class Test13 
{
	public static void main(String[] args)
	{
//		testu abc = new testu(45,"Ujjwal");
		testu abc = new testu("Ujjwal" , 45);
	}
}
