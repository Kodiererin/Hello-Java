package a_DSA_With_CollectionFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CF_14_Properties
{
	public static void main(String[] args) throws FileNotFoundException, IOException
	{
//		Here Key and Value both are Strings.
//		Are used mostly in Settings where both Values are in Strings Datatype.
//		Property : This Datatype is Inherited from HashTable(collection of key-Value pair).
//		Has features of HashTable. But in properties.
		java.util.Properties p = new java.util.Properties();
		p.setProperty("Company", "HP");
		p.setProperty("Sub-Brand", "Inspiron");
		p.setProperty("Type", "Gaming-Laptop");
		p.setProperty("Size", "15.6 inch");
		p.setProperty("OS", "Windows 10");

		System.out.println(p);

//		Lets store the value
//		Text File
		p.store(new FileOutputStream("C:/Users/Ujjwal/Desktop/laptopdata.txt"), "No-Comments");
//		One  input is for the FileLocation + File Name and Second one is for the comments.

//		XML file
		p.storeToXML(new FileOutputStream("C:/Users/Ujjwal/Desktop/laptopdataa.xml"), "noComments");


		System.out.println("The Imported Data");
//		Lets Import the file and do some operations.
		p.load(new FileInputStream("C:/Users/Ujjwal/Desktop/testData.txt"));
		System.out.println(p);

//		Lets Import XML file.
		p.loadFromXML(new FileInputStream("C:/Users/Ujjwal/Desktop/laptopdataa.xml"));
		System.out.println(p);

	}
}
