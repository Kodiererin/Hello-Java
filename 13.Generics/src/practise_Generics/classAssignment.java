package practise_Generics;
class Box<t>
{
	t var1;
	t var2;
	Box(t var1 , t var2	)
	{
		this.var1 = var1;
		this.var2 = var2;
	}
	void change() 
	{
		this.var2 = this.var1 = this.var2;
	}
	void show()
	{
		System.out.println("There has been a change in the Variables "+var1+" "+var2);
	}
	
}
public class classAssignment 
{
	public static void main(String[] args) 
	{
		Box<String> b1 = new Box("Ujjwal " , "Kumar");
		b1.change();
		b1.show();
		
		Box<Integer> b2 = new Box(29,36);
		b2.change();
		b2.show();
		
//		Box<String , Integer/>
//		have become clueless what to do further...
	}
}
