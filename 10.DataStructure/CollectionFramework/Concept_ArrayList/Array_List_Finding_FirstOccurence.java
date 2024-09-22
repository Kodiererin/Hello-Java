package Concept_ArrayList;

import java.util.ArrayList;

class indexOf_Info
{
	indexOf_Info()
	{
		System.out.println("----- THE INDEX OF ARRAY-------");
		System.out.println("indexOf() ~ this method shows the array index from starting points.");
		System.out.println("lastIndexOf() ~ this method shows the array the index number from the last ");
	}
}

public class Array_List_Finding_FirstOccurence extends Thread
{
	public static void main(String[] args)
	{
		ArrayList<Integer> al1 = new ArrayList<>();
		ArrayList<Integer> al2 =  new ArrayList<>();
		al1.add(34);
		al1.add(49);
		al1.add(44);
		al1.add(97);
		al1.add(10);

		al2.add(141);
		al2.add(131);
		al2.add(121);
		al2.add(101);
		al2.add(101);
		al2.add(111);

		System.out.println("The First Array list ="+al1);
		System.out.println("The Second Array list ="+al2);

		al1.addAll(al2);
		System.out.println("The Merged Array ="+al1+"\n");

		System.out.println("The Index of 44 in First Array is "+al1.indexOf(41));	// the array has been merged
		System.out.println("The Index of 101 in Second Array is "+al2.indexOf(101));		// the second array
//		this index of and last index of array best use is to find the array index of the duplicate numbers, as described below.
		System.out.println("\nThe First Index of 101 in Merged Array is "+al1.indexOf(101));		// the array has been merged
		System.out.println("\nThe Index from the lastof 101 in Merged Array is "+al1.lastIndexOf(101));		// the last Index of....


	}
}
