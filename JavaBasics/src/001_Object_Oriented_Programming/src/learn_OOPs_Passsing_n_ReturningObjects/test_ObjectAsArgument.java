package learn_OOPs_Passsing_n_ReturningObjects;
class test
{
	int real;
	int img;
	test(int real , int img)
	{
		this.real = real;
		this.img = img;
	}
	test(test obj)
	{
		this.real = obj.real;
		this.img = obj.img;
	}
	void show()
	{
		System.out.println("Imaginary Number is "+this.real);
		System.out.println("Real Number is "+this.img);
	}
}
public class test_ObjectAsArgument 
{
	public static void main(String[] args) 
	{
		System.out.println("Testing the Program...");
		test obj = new test(20,30);
//		creating a copy of the object
		test obj2 = obj;
		obj.show();
		obj2.show();
	}
}
