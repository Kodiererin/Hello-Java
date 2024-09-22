package Practise_OOPs;
class parent
{
	int x;
	int y;
	parent(int x , int y)
	{
		this.x = x;
		this.y = y;
	}
	void display()
	{
		System.out.println("The Sum of two numbers  "+(x+y));
	}
}
class child extends parent
{
	int c;
	child(int x , int y , int z)
	{
		super(x,y); 			// super keyword zaruri hai so keep in check and go ahead....
		this.c = z;
	}
	void show()
	{
		System.out.println("The Sum of three Numbers is "+(x+y+c));
	}
}
public class practise_super_interface 
{
	public static void main(String[] args) 
	{
		System.out.println("Welcome to Ujjwal Testing PC");
		System.out.println("This Program intention is demonstrate Super Keyword when we are using the Constructor so that you could know ");
		System.out.println("The importance of Super Keyword and move ahead");
//		Scanner sc = new Scanner(System)
		parent obj = new parent(36 , 99	);
		obj.display();
		child obj2 = new child(36,78,98);
		obj2.show();
	}
}
