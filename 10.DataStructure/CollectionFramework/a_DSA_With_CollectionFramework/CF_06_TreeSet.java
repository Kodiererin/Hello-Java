//	Tree Set : The Advantage of tree set is that basic operation like insertion, deletion searching takes Log(n) time.
//	It is a sorted set that means it automatically arranges itself.



package a_DSA_With_CollectionFramework;
import java.util.Collection;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
public class CF_06_TreeSet
{
	public static void main(String[] args)
	{
//		TreeSet<Integer> ts = new TreeSet<Integer>();	First Method
		TreeSet<Integer> ts = new TreeSet<>(List.of(90,12,20,20,30,40,50));	//Second Method
//		System.out.println(ts);		// Sorted Arranges tree set comes out.
		ts.add(25);
		System.out.println(ts);
		System.out.println(ts.ceiling(45));		// 50
		System.out.println(ts.ceiling(50));		// 50
		System.out.println(ts.ceiling(500));	// null

		Collection<Integer> ts2 = new TreeSet<>();
//		We can only call colletion class methods only.

		SortedSet<Integer> ts3 = new TreeSet<>();
//		We can only call Sorted Set class methods only.
	}
}
