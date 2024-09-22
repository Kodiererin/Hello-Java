package learn_OOPs_Passsing_n_ReturningObjects;
class test1
{
	int number1;
	int number2;
	test1(int number1 , int number2)
	{
		this.number1 = number1;
		this.number2 = number2;
	}
	test1(test1 obj)
	{
		this.number1 = obj.number1;
		this.number2 = obj.number2;
		System.out.println(this.number1 + this.number2);
	}
	test1 show(test1 obj)
	{
		obj.number1 = obj.number1 + obj.number2;
		return obj;
	}
	int show2(test1 obj)
	{
		obj.number1 = obj.number1 + obj.number2;
		return obj.number1;
	}
//	creating a temporary method to see n check, delete if consufing.......
	test1 tempMeth(test1 obj)
	{
		System.out.println(obj.number1+" "+obj.number2);
		return obj;
	}
}
public class test_returnObject 
{
	public static void main(String[] args) 
	{
		System.out.println("Testing Program 2");
		test1 obj = new test1(36,45);
//		lets create a copy of it.
		test1 obj2 =obj;
		System.out.println(obj2.show(obj2));
		System.out.println(obj.show(obj));
		
		test1 tobj = new test1(69,96);
		test1 tobj2 = new test1(tobj);
//		System.out.println(tobj.show(tobj2));
		System.out.println(tobj.show2(tobj2));
		System.out.println(tobj.tempMeth(tobj2));
	}
}
