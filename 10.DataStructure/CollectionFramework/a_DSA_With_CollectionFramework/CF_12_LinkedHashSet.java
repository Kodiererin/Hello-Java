package a_DSA_With_CollectionFramework;

import java.util.Iterator;

//	Will maintain the insertion of  elementss.
//	It stores the value only whereas HashSet stores the key as well as the value.
//	In LinkedHashSet we only insert the value but in HashSet We insert the Key and The value.
//	We cannot set the limit in Linked Hash Set

//	In HashSet and LinkedHastSet you cannot add duplicate elements in the set.
public class CF_12_LinkedHashSet
{
	public static void linkedHashSet()
	{
		java.util.LinkedHashSet<Integer> lhs = new java.util.LinkedHashSet<>();
		lhs.add(23);
		lhs.add(34);
		lhs.add(56);
		lhs.add(3);
		lhs.add(54);
//		Output using for each
		lhs.forEach(System.out::println);
//		Using Iterators
//		Iterator<Integer> i = lhs.iterator();
//		while(i.hasNext())
//		{
//			System.out.println(i.next());
//		}

//		The element dosent get arranged so the set is not a Sorted Set.
	}
	public static void HashSet()
	{
//		HashSet is a Sorted set which arranges the elements automatically.
		System.out.println("HashSet");
		java.util.HashSet<Integer> hs = new java.util.HashSet<>();
		hs.add(23);
		hs.add(34);
		hs.add(56);
		hs.add(3);
		hs.add(54);
		Iterator<Integer> i = hs.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
	public static void main(String[] args)
	{
//		linkedHashSet();
		HashSet();
	}
}
