package TestString;

class compareTo_methods
{
	public static void infoCompareTo()
	{
		System.out.println("1. The Java String class compareTo() method compares the given string with the current string lexicographically. ");
		System.out.println("2. It returns a positive number, negative number, or 0. It compares strings on the basis of the Unicode value of each character in the strings.");
		System.out.println("3. if string1 > string2, it returns positive number  \r\n"
				+ "if string1 < string2, it returns negative number  \r\n"
				+ "if string1 == string2, it returns 0  ");
		System.out.println("4.  lexicographically ka mtlb hai Dictionary wise Kisi words ka jaana ");
		System.out.println("source ~ GEEKSFORGEEKS");
	}
	public static void  int_compareTO()
	{
		System.out.println("This method compares this String to another Object. ");
		System.out.println(" int compareTo(Object obj)\n");
		String str= new String("Ujjwal Kumar");
		String str1 = new String("Ujjwal");
		String str2 = new String("Kumar");
		System.out.println("Difference of Ujjwal(str1) and UjjwalKumar(Str) : "+ str.compareTo(str1) );
		System.out.println("Difference of Kumar(str2) and UjjwalKumar(Str) : "+ str.compareTo(str2) );
		System.out.println("Difference of Kumar(str2) and Ujjwal(Str1) : "+ str1.compareTo(str2) );
		System.out.println("\n\n");
	}
	public static void compareTo()
	{
		System.out.println("This Method Compares two strings lexiographically");
		System.out.println("Be Careful that the Uppercase and lower Case also matters");
		String x = "Ujjwal";
		String y = "Kumar";
		String z = "Ujjwal";
		String x1 = "ujjwal";
		String x2 = "Ujjwal Kumar";
		System.out.println(x.compareTo(y));
		System.out.println(x.compareTo(z));
		System.out.println(x.compareTo(z));
		System.out.println(x.compareTo(x1));
		System.out.println(x.compareTo(x2));
		System.out.println("\n\n");
	}
	public static void compareTo_byignoringcars()
	{
		System.out.println("This Method Compares two strings lexiographically");
		System.out.println("This Method ignores Upper case and Lower Case");
		String name = "Ujjwal";
		String Kumar = "Kumar";
		String kumar = "kumar";
		System.out.println(name.compareToIgnoreCase(Kumar));
		System.out.println(Kumar.compareToIgnoreCase(kumar));
	}
}
public class concept_methods_Strings 
{
	public static void main(String[] args) 
	{
		compareTo_methods.infoCompareTo();
		compareTo_methods.int_compareTO();
		compareTo_methods.compareTo();
		compareTo_methods.compareTo_byignoringcars();
	}
}
