// Method/ Function overloading jo hm log krne wale h!... Best of Luck...
package MethodOverloading;
public class methodOverloading 
{
	public static int add(int x , int y)
	{
		return x+y;
	}
	public static String add(String x , String y)
	{
		return x+y;
	}
	public static void main(String[] args) 
	{
		System.out.println("Chaliye Shuru krte h!");
		System.out.println(methodOverloading.add(5,6));
		System.out.println(methodOverloading.add("Ujjwal ", "Kumar"));
	}
}
