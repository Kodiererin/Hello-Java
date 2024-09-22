package s_1_String;


//	String is a sequence of characters.
//	In Java Every character stores in 16 bit.
//	There are four ways to make String.
//	By Array character[] arr = new character{a,b,c,d,}...

//	String Class
//	StringBuffer class
//	StringBuilder class.
//	Advantage in them is they have many String Specific Functions.
//	We have three classes because String class Objects are immutable.

//			String Class
//	String Immutable Means : The content of the String cannpt be Changed.
//	They return the new object eg String.concat , .trim etc.... They dont make the changes in the Existing String.

//			StringBuffer class and String Builder Class
//	These Class return mutable string(updated String)
//	They are thread safe class (StringBuilder is not thread safe class).

//	Single Threaded Class : StringBuilder class
//	Multi Threaded class + Mutable : StringBuffer class.
//	Single Class + Immutable String : String Class.

//	Note : Strings are already immutable, they donot need Thread Safety class. They are automatically safe.
//	String class are Automatically String Safe.


class stringInJAVA
{
	public  void geeks(String str)
	{		// str = ujjwal				str2 = "kumar"
//		index		 012345				index   01234
		String str2 = "kumar";
		System.out.println(str.length());			//6
		System.out.println(str.charAt(3));			//w
		System.out.println(str.substring(2));		//wal
		System.out.println(str.substring(2,5));		//jwa
		System.out.println(str.contains(str2));		//false
//		compareTo function : It compares the two functions Lexiographically!.
//		same -> 0 if(str>str2) +ve value else -ve value.
		System.out.println(str.compareTo(str2));	//0
//		indexOf -> extension of contains function
//		indexOf returns -ve if not present else returns the index of first reurrence element.
//		but the string must be present in the other string.
		System.out.println(str.indexOf(str2)); 		// -1
//		Similarly there is a lastIndexOf.


	}
//	if the two String have the same content then Java donot allocate new memory to the new Variable
//	eg : String x = "Ujjwal" && String y = "Ujjwal" 			-> Both will have the same memory
//	Such thing is Called String Literal Pool in JAVA.
	public  void checkReference()
	{
		System.out.println("String Literal Reference.");
		String x = "Ujjwal";
		String y = "Ujjwal";
		if(x==y)
			System.out.println("Yes");
		else
			System.out.println("No");
//		if you create a new String Using new Keyword then even though having the same data a New String will be assigned
		String m = new String("Ujjwal");
		if(x==m)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
public class b_string_in_JAVA
{
	public static void main(String[] args)
	{
		stringInJAVA obj = new stringInJAVA();
		obj.geeks("Ujjwal");
		obj.checkReference();
	}
}
