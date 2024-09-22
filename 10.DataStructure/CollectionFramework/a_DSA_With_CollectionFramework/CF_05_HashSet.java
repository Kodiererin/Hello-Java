package a_DSA_With_CollectionFramework;
import java.util.HashSet;
import java.util.Iterator;
//	HashSet is a set which has no duplicate elements and is a Hashing Table.
//	Unlike Linkedlist and Array List it takes O(1) time for insertion and deletion.
//	It has a loading factor which tells how much %age of space will be blank and it also boosts the insertion and deletion.
//	Default value of the loading factor is 0.75 but 0.5 is preffered.
//	In Hashset it is not necessary that the elements are arranged as per the insertion.
//	We must use HashSet because the Insertion and deletion is O(1) time only.
public class CF_05_HashSet
{
	public static void main(String[] args)
	{
//		HashSet<Integer> hs = new HashSet<Integer>();		Initial size will be set to 16 and Loading factor is 0.75.
//		HashSet<Integer> hs = new HashSet<Integer>(30); 	Size changed to 30 and Loading Factor is till 0.75
		HashSet<Integer> hs = new HashSet<>(30,(float) 0.5);

		hs.add(12);
		hs.add(34);
		hs.add(31);
		hs.add(12);
		hs.add(45);
		Iterator i = hs.iterator();
		while(i.hasNext() )
		{
			System.out.println(i.next());
		}
		System.out.println("The Size of the HashSet is "+hs.size());
	}
}
