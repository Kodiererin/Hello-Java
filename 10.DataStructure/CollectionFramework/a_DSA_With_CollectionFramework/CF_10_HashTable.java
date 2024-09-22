package a_DSA_With_CollectionFramework;

//	It Implements MAP interface
//	its Methods are implemented from Map interface

import java.util.Enumeration;
import java.util.Hashtable;

public class CF_10_HashTable
{
	public static void main(String[] args)
	{
//		Hashtable ht = new Hashtable();
		Hashtable<Integer,String> ht = new Hashtable<>();
		ht.put(1, "A");
		ht.put(2, "B");
		ht.put(3, "C");
		ht.put(4, "D");
		ht.put(5, "E");

//		HashTable uses object not any class like Integer, String etc.
		String s = ht.get(3);
//		In order to extract class we have to use type-casting
//		It is not a generic class.
//		We have to enumerator not the iterator because it is an old class.

		Enumeration e = ht.keys();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}


//		to change the value of a particular key
		ht.compute(2, (k,v)->v+"z");
		System.out.println(ht.get(2));

//		compute if not present
		ht.computeIfAbsent(7, (k)->"Z"+k);

		System.out.println("------------------");
		Enumeration e1 = ht.keys();
		while(e1.hasMoreElements())
		{
			System.out.println(e1.nextElement());
		}
	}
}
