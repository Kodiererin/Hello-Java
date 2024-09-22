class Parameterised_Constructor 
{
	String name ;
	int id;
	Parameterised_Constructor(String name , int id)
	{
		this.name = name;
		this.id = id;
	}
}
class Kumar
{
	public static void main(String[] args)
	{
		Parameterised_Constructor obj = new obj("Ujjwal" , 1);
		System.out.println("His Name = "+obj.name+" Aur uska id hai "+obj.id);
	}
}
