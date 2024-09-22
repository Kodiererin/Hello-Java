package Concept_ArrayList;

import java.util.ArrayList;

class Array_List_Removing_Element_info
{
	Array_List_Removing_Element_info()
	{
		System.out.println("--- REMOVING AN ELEMENT----");
		System.out.println("1. remove() ~ remove() method is used to delete or remove an element at a given index from the array list ");
		System.out.println("2. Syntax ~ l1.remove(Index Number");
		System.out.println("3. l1 ek Object ka naam h");
	}
}
public class Array_List_Removing_Element extends Thread
{
	public static void main(String[] args)
	{
		Array_List_Removing_Element_info info = new Array_List_Removing_Element_info();
		System.out.println();
		ArrayList<Integer> l1 = new ArrayList<>();
		l1.add(23);
		l1.add(22);
		l1.add(99);
		l1.add(91);
		l1.add(54);
		l1.add(55);
		System.out.println("The Array list before removing "+l1);
//		now I am using the removing Method
		l1.remove(4);
		System.out.println("The Array list After removing "+l1);

		ArrayList<Integer> l2 = new ArrayList<>();
		l2.addAll(l1);
		System.out.println(l2);
	}
}
