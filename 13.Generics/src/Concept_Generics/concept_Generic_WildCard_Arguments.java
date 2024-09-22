package Concept_Generics;
import java.io.*;

class info_WildCard
{
	info_WildCard()
	{
		System.out.println("These are a special feature of GENERICS. Suppose one wants to define a method inside the GENERIC class which compares the value of different types of GENERIC class"
				+ "\nObjects and returns the result, irrsespective of their types. Previously it was not possible because a method defined inside the GENERIC class could only act upon the"
				+ "\nDatatypes which wer the same as that of the object calling it. However this can be done using \"WILD CARD ARGUMENTS\"."
				+ "\n Ujjwal can understand this by looking the below code");
	}
}
// a class has been Created Generics
class UjjwalGener<dType>
{
	dType varCreated;
	UjjwalGener(dType var1)
	{
		varCreated = var1;
	}
//	Wildcard Argument is getting used.
	void checkDatatype(UjjwalGener<?> varGet)			// kch nhi h bs <?> hai jo check ho rha h!
	{
		if(varCreated == varGet.varCreated)
		{
			System.out.println("The Datatype is Same");
		}
		else
		{
			System.out.println("The Datatype is not same");
		}
	}
}
public class concept_Generic_WildCard_Arguments 
{
	public static void main(String[] args) throws IOException 
	{
		info_WildCard inf = new info_WildCard();
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter Your Name");
			String name = br.readLine();
//		UjjwalGener<datatype> obj = new UjjwalGener<Datatype>("Ujjwal");
		UjjwalGener<String> obj = new UjjwalGener<String>(name);
		obj.checkDatatype(obj);
		
		System.out.println("Enter a Number ");
		String n = br.readLine();
		int x = Integer.parseInt(n);
		UjjwalGener<Integer> obj1 = new UjjwalGener<Integer>(x);
		obj1.checkDatatype(obj1);
	}
}