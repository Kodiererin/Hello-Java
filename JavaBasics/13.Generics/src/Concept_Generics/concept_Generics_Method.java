package Concept_Generics;

public class concept_Generics_Method 
{
//	we can create Generic methods without creating a Generic Class
//	Example is Shown Below
	public static<T> boolean check(T val1 , T val2)
	{
//		creating a method that check if the value is equal or not
		return (val1.equals(val2));
	}
	public static void main(String[] args) 
	{
		System.out.println(check("Ujjwal","Kumar"));
		System.out.println(check("Ujjwal","Ujjwal"));
		System.out.println(check("Ujjwal","ujjwal"));
//		is Equals check if the method is equal or not
	}
}
