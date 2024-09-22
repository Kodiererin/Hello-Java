package a_DSA_With_CollectionFramework;

import java.util.Enumeration;

public class CF_13_HashTable
{
//	Hashtable is an old class. In previous versions it was object based class and now it is a Generic Based class.
//	Previous objects were used in HashTable so inorder to extract data we had to extract the data by typecasting it.
//	Being an old DataStructure here either we can use enumerisation or iteration for iterating through the objects.
	public static void main(String[] args)
	{
		java.util.Hashtable<Integer, String> obj = new java.util.Hashtable<>();
//		As it is a HashTable so Integer is the key and String is the Reference.
		obj.put(23, "Ujjwal");
		obj.put(2, "Kumar");
		obj.put(3, "UK");
		obj.put(4,"UjjwalKumar");

//		Printing the Table.
//		Enumeration<Integer> e = obj.keys();
//		while(e.hasMoreElements())
//		{
//			System.out.println(e.nextElement());
//		}

//		We can concat the Value
		obj.compute(2, (k,v)->v+"z");
		System.out.println(obj.get(2));

//		Concat if Absent
		obj.computeIfAbsent(9, (k)->"Z"+k);


		Enumeration<Integer> e = obj.keys();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
	}
}
