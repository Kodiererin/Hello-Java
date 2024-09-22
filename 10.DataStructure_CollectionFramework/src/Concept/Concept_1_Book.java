package Concept;
class infoGenerice
{
	infoGenerice()
	{
		System.out.println("1. Before Generics there has been a Huge problem in dealing with different datatypes with same logic.");
		System.out.println("2. If One has to design a swapping program for an integer object for an integer object , then it could not work for other datatypes.");
		System.out.println("3. Generics Solved these overheads.");
		System.out.println("       WHAT IS GENERICS?   ");
		System.out.println("4. Generics is a powerful tool in java introduced in JAVA JDK 5.");
		System.out.println("5. Using Generics a Programmer can create classes, interfaces and methods that will work for various datatype in java");
		System.out.println("6. One can define a single algorithm which is independent of data ; then apply the same algorithm for various datatype in javawithout any changes");
	}
}
class Gener<S>
{
	S obj;
	Gener(S o)
	{
		obj = o;
	}
	void showCLass()
	{
		System.out.println("Type of S is "+obj.getClass().getName());
	}
	void showData()
	{
		System.out.println("Data is "+obj);
	}
}
public class Concept_1_Book 
{
	public static void main(String[] args) 
	{
		infoGenerice info = new infoGenerice()	;
		System.out.println();
//		Generate a Gener reference for integer
		Gener<Integer> ob1 = new Gener<Integer>(100);
//		prints the type of the data held by it
		ob1.showCLass();
//		prints the data held by it.
		ob1.showData();
//		create a gener reference for string
		Gener<String> ob2 = new Gener<String>("Ujjwal , Kumar");
//		prints the type of data held by it
		ob2.showCLass();
//		prints the data held by it.
		ob2.showData();
		System.out.println();
		Gener<Double> ob3 = new Gener<Double>(100.00);
		ob3.showCLass();
		ob3.showData();
	}
}
