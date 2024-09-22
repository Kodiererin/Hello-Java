
public class test_classUnderCLass 
{
	public static class Test
	{
		Test() 
		{
			System.out.println("Hello I am Nested class");
		}
	}
	public static void main(String[] args) 
	{
		test_classUnderCLass.Test t1 = new Test();
		System.out.println("Hello");
	}
}
