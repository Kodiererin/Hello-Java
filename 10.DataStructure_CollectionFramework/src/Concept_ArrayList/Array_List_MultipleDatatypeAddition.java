package Concept_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
		for(int i=0 ; i<obj.size() ; i++)
		{
			System.out.println(obj.get(i));
		}
	}
}
