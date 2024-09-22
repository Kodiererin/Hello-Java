class Hello2
{
	int id;
	String name;
	Hello2(int x , String y)
	{
		id = x;
		name = y;
	}
	public void show()
	{
		System.out.println("The Numbers are "+id);
		System.out.println("The Name is "+name);
	}
	Hello2()
	{
//		copy constructor use kaise kre.....................................
	}
}
class Test14
{
	public static void main(String[] args)
	{
		Hello2 kemcho = new Hello2(24 , "Ujjwal");
		kemcho.show();
		Hello2 motabhai = new Hello2(36, "Mota Bhai");
		motabhai.show();
	}
}