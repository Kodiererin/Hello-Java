package i_Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//	Collections.sort() is used to sort collections expecially collections (list collection).
//	List collections are the collections that implements "List Interface" -> Linked List and Array List.

public class e_CollectionsSort1
{
	public static void main(String[] args)
	{
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(5);
		list.add(20);
		Collections.sort(list);
		System.out.println(list);				// before reversing
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);				// after reversing
	}
}
//	Wrapper classes implement comparable Interface; it means that they have a compareTo function inside the which can be used
//	two integers to decide which one should go first..
//	collections.reverseOrder function uses the functions compareTo() and returns the compartor and returns order which reverse
//	of what is written in the compare to, these classes