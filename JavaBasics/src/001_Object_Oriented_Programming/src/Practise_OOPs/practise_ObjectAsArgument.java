//	See the TestClass2 for as some correction is required.
//	TestClass1 has been copied form GeeksForGeeks..
package Practise_OOPs;
class TestClass
{
//	returning an ObjectDemo
	int a;
//	constructor
	TestClass(int x)
	{
		this.a = x;
	}
//	method returns an object
	TestClass addTen()
	{
		TestClass t1 = new TestClass(this.a + 10);
		return t1;
	}
}
class TestClass2
{
	int var1;
	TestClass2(int var1)
	{
		this.var1 = var1;
	}
	TestClass2 Ujjwal()
	{
		TestClass2 tc2 = new TestClass2(this.var1 + 10);
		return tc2;
	}
	TestClass2 UjjwalCopy(int x)
	{
		TestClass2 tc3 = new TestClass2(x);
		tc3 = Ujjwal();
		return tc3;
	}
}
public class practise_ObjectAsArgument 
{
	public static void main(String[] args) {
//	System.out.println("Practise Object as Arguments");
//	TestClass obj = new TestClass(2);
////	create a copy of obj;
//	TestClass obj2;
//	obj2 = obj.addTen();
//	System.out.println("obj.a = "+obj.a);
//	System.out.println("obj2.a = "+obj2.a);
		
//		Testing a New Class 
		TestClass2 obj2= new TestClass2(20);
		TestClass2 obj21 = obj2.Ujjwal();
			System.out.println(obj21);
		obj21 = obj2.UjjwalCopy(36);
		System.out.println(obj21);
	}
}
