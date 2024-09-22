package practise_Generics;

import java.util.Scanner;

class sum<dtype>
{
	dtype x;
	dtype y;
	sum(dtype x , dtype y)
	{
		this.x = x;
		this.y = y;
	}
	void showType()
	{
		System.out.println("The Datatype of Variable 1 is "+x.getClass());
		System.out.println("The Datatype of Variable 2 is "+y.getClass());
	}
	void useMethods()
	{
		System.out.println("Using Hash Code to See what Happens "+x.hashCode());
		System.out.println("Using toString method "+x.toString());
//		System.out.println("Using Notify Method "+x.notify());		throws error
//		System.out.println("Using Wait Method "+x.wait(3600));		compiletime error
		System.out.println(""x.);
	}
	void addMeUp()
	{
		System.out.println("The Sum of the Two Variables is "+x+" "+y);
//		System.out.println("");
	}
}
public class practise_Generics_simpleAdd 
{
	public static void main(String[] args) 
	{
		System.out.println("Welcome to Practise Generics 1");
		Scanner sc = new Scanner(System.in);
		System.out.println("Creating an Objet of Double ");
		System.out.println("Enter the numbers in Decimal");
//		sum<Double> obj = new sum<Double>(sc.nextDouble(),sc.nextDouble());
		sum<String> obj2 = new sum<String>(sc.next(),sc.next());
		obj2.showType();	
		obj2.addMeUp();
		obj2.useMethods();
//		obj.showType();	
//		obj.addMeUp();
	}
}
