class Hello1
{
	private int id;
	private String name;
	
	public Hello1()
	{
		id = 0;
		name = " ";
	}
	public Hello1(int x , String y)
	{
		id = x;
		name = y;
	}
	public Hello1(String y)
	{
		id = 1;
		name = y;
	}
	public Hello1(int x)
	{
		id = x;
		name = "No Input";
	}
	public String getname()
	{
		return name;
	}
	public void setname(String n)
	{
		this.name = n;
	}
	public void setId(int i)
	{
		this.id = i;
	}
	public int getid()
	{
		return id;
	}
}
public class Constructor_with_Attributes_Private 
{
	public static void main(String[] args)
	{
		Hello1 xyz = new Hello1();
		System.out.println(xyz.getid());
		System.out.println(xyz.getname());
	}
}
