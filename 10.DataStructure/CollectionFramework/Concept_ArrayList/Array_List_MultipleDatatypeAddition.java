package Concept_ArrayList;

import java.util.ArrayList;

public class Array_List_MultipleDatatypeAddition
{
//	we can add Multiple Datatype elements in the array.
//	it is not necessary that we can add only one datatype elements in the array.
	public static void main(String[] args)
	{
		ArrayList<Object> obj = new ArrayList<>();
		obj.add(12);
		obj.add("Ujjwal");
		obj.add(1.1);
		obj.add('e');
		obj.add("Hello");
		for (Object element : obj) {
			System.out.println(element);
		}
	}
}
