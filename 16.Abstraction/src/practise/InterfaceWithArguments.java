package practise;
//	Ultimate moto was to check if the Argument can carry Parameters or Not
interface Ujjwal
{
	void showMarks(int x);
	void displayName(String name);
	void showGender(char c);
}
interface Ujjwal2
{
	void district(String dist);
	void state(String state);
	void country(String country);
}
abstract class Hello
{
	abstract void message();
	void greetings()
	{
		System.out.println("Okay Buddy Bye Bye Then");
	}
}
class child extends Hello implements Ujjwal,Ujjwal2
{

	@Override
	public void district(String dist) 
	{
		System.out.println("District : Dhanbad");
	}

	@Override
	public void state(String state) {
		// TODO Auto-generated method stub
		System.out.println("State : Jharkhand");
	}

	@Override
	public void country(String country) {
		// TODO Auto-generated method stub
		System.out.println("Country : INDIA");
	}

	@Override
	public void showMarks(int x) {
		// TODO Auto-generated method stub
		System.out.println("Total Marks - 98");
	}

	@Override
	public void displayName(String name) {
		// TODO Auto-generated method stub
		System.out.println("Name : 	UJJWAL KUMAR");
	}

	@Override
	public void showGender(char c) {
		// TODO Auto-generated method stub
		if(c=='m')
		{
			System.out.println("Gender is Male");
		}
		if(c=='f')
		{
			System.out.println("Gender is Female");
		}
		else
		{
			System.out.println("Gender Is Undefined");
		}
	}

	@Override
	void message() {
		// TODO Auto-generated method stub
		System.out.println("Aacha Chalta hu Duyao me yaad rakhna");
	}
	
}
public class InterfaceWithArguments 
{
	public static void main(String[] args) 
	{
		System.out.println("Kemcho mota Bhai");
		child c1 = new child();
		c1.displayName(null);
		c1.state(null);
		c1.country(null);
		c1.showGender('m');
		c1.showMarks(0);
		c1.displayName(null);
		c1.greetings();
	}
}