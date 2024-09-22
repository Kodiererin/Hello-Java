package ObjectOrdering;

public class ObjectOrdering_1 
{
	void show()
	{
		System.out.println("You can order the Object By Just Using some functions");
//		Inherited From HackerRank you can order the Objects by performing some operartions.
	}
	class Hello
	{
		String name;
		int data;
//		Hello(String name , int data)
//		{
//			this.name = name;
//			this.data = data;
//		}		
	}
	public static void main(String[] args) 
	{
		System.out.println("JHello");
		Hello [] h = new Hello[5];
		h[0].data = 5;
		h[0].name ="A";
		h[1].data = 65;
		h[1].name ="Z";
		h[2].data = 4;
		h[2].name ="P";
		h[3].data = 91;
		h[3].name ="x";
		System.out.println(h[2].data);
		System.out.println(h[0].hashCode());
	}
}
