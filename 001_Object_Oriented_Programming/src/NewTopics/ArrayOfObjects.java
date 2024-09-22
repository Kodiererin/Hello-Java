package NewTopics;

import java.util.Scanner;

class ObjectArray 
{
//	this class has been made to show that how you can make array of objects.
//	source of this code is from class #SantoshSir
//	just a sample code to show array of objects
	int classNo;
	int regno;
	String name;
	ObjectArray(int classno,int regno,String name)
	{
		this.classNo = classno;
		this.regno = regno;
		this.name = name;
	}
	void show()
	{
		System.out.println("The Registration No = "+this.regno);
		System.out.println("The class No is = "+this.classNo);
		System.out.println("The Name of the Student "+this.name);
		System.out.println("***************************************************************************************************");
	}
}
public class ArrayOfObjects
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Kemcho Ujjwal Bhai, Mojame ki Naahi");
		System.out.println("Enter The Strength of the class ");
		 	int strength = sc.nextInt();
		ObjectArray [] objectOA = new ObjectArray[strength];
		System.out.println("Enter the details of the student");
		System.out.println("Registration NO,Class No and Name in Serial No");
		for(int i=0 ; i<objectOA.length ; i++)
		{
			objectOA[i] = new ObjectArray(sc.nextInt(),sc.nextInt(),sc.next());
		}
		for(int i=0 ; i<objectOA.length ; i++)
		{
			objectOA[i].show();
		}
	}
}
