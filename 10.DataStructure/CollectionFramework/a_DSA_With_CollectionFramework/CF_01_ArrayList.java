//	ArrayList arranges the List quickly than Linked List

package a_DSA_With_CollectionFramework;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
public class CF_01_ArrayList
{
	public static void main(String[] args)
	{
//		new Concept : Iterator and List Iterator
		ArrayList<Integer> a1 = new ArrayList<>();
		a1.add(23);
		a1.add(99);
		a1.add(31);
		a1.addAll(List.of(12,23,34,56));
//		First Way to Print the ArrayList
		System.out.println("By Using For Loop");
		for (Integer element : a1) {
			System.out.println(element);
		}
//		Second Way to Print the Array List -> forEach Loop
		System.out.println("For Each Loop");
		a1.forEach((x)-> System.out.println(x));
//		Third Way to Print the Array List -> By Using Iterator
//		There are two types of Iterator
//		1. Iterator						2. ListIterator
//		ListIterator has more functions and than Iterator and is Widely used.
		System.out.println("By Using Iterator");
		for (Integer x : a1) {
			System.out.println(x);
		}
		System.out.println("By Using List Iterator");
		ListIterator<Integer> l2 = a1.listIterator();			// check this statement carefully!
		while(l2.hasNext())
		{
			System.out.println(l2.next());
		}

//		By using Lambda Expression
		System.out.println("By using Lambda Expression");
		a1.forEach(n-> System.out.println(n));
		System.out.println("Lambda Expression -> Second Method");
		a1.forEach(System.out::println);  // :: This is Double Resolution
	}
}
