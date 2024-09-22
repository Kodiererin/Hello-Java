package Concept_Generics;
// This is code from Code_With_harry
class myGeneric< U1 , U2>
{
	int val;
	private U1 var1;
	private U2 var2;
	
	public myGeneric(int val , U1 a , U2 b)
	{
		this.val = val;
		this.var1 = a;
		this.var2 = b;
	}
	public U1 getVar1() 
	{
		return var1;
	}
	public U2 getVar2() 
	{
		return var2;
	}
	public void setVar1(U1 var1) 
	{
		this.var1 = var1;
	}
	public void setVar2(U2 var2) 
	{
		this.var2 = var2;
	}
	
}
public class concept_Generics2 
{
	public static void main(String[] args) 
	{
		myGeneric<Integer , String> obj = new myGeneric(23 , 99 , "Ujjwal");
		String str = obj.getVar2();
		int num = obj.getVar1();
		System.out.println(str+" "+num);
		
		myGeneric<Double , Integer> obj1 = new myGeneric(38 , 98.9 , 99);
		double d = obj1.getVar1();
		int i = obj1.getVar2();
		System.out.println("The number of Different Datatypes are "+d+" & "+i);
	}
}
