package Concept_Generics;
import java.util.*;
class infoGenerics
{
	infoGenerics()
	{
		System.out.println("1. Generics was introduced from JAVA JDK 5.0 onwards");
		System.out.println("2. The java generics helps us to deal with the compiler time type easily.");
		System.out.println("3. With the help of the generics, we can write a single method and call it with different argument types.(Integres, Strings etc...)");
	}
}
class Gener<s>
{
	s obj;
	Gener(s o)
	{
		obj = o;
	}
	void showClass()
	{
		System.out.println("Type of s(Datatype) is "+obj.getClass().getName());
	}
	void showData()
	{
		System.out.println("Data is "+obj);
	}
}
public class concept_Generics 
{
	public static void main(String[] args) 
	{
//		Create a gener reference for integer 
		Gener<Integer> ob1 = new Gener<Integer>(100);
//		prints the type of data held by  it
			ob1.showClass();
//		prints the data held by  it
			ob1.showData();
		
//		Create a gener reference for String
			Gener<String> ob2 = new Gener<String>("Ujjwal Kumar");
			ob2.showClass();
			ob2.showData();
	}
}
