package a_DSA_With_CollectionFramework;

import java.util.Iterator;
import java.util.List;

public class CF_02_LinkedList
{
	public static void main(String[] args)
	{
		java.util.LinkedList<Integer> l1 = new java.util.LinkedList<>();
		l1.add(10);
		l1.add(20);
		l1.addLast(30);
		l1.addFirst(0);
		Iterator<Integer> i = l1.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}

//		Experiments

		l1.addAll(List.of(99,98,97));
		Iterator<Integer> i2 = l1.iterator();
		while(i2.hasNext())
		{
			System.out.println(i2.next());
		}
	}
}
