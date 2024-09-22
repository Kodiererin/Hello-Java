package a_DSA_With_CollectionFramework;
import java.util.LinkedHashMap;
public class CF_11_LinkedHashMap
{
	public static void main(String[] args)
	{
//		LinkedHashMap<Integer,String> lhm = new LinkedHashMap<>(5);
//		LinkedHashMap<Integer,String> lhm = new LinkedHashMap<>(5 , 0.75f);
		LinkedHashMap<Integer,String> lhm = new LinkedHashMap<>(5 , 0.75f , true);
//		true says if you want the map to be as per order? The elements will be arranges as per their call.

//		Now if I want to limit the size then? How we will do? You have to override one of the method
//		boolean removeEldestEntry(Map.Entry e)
//		{
//			return size()>5;
//		}
//		This method tells when to remove the eldest entry.
//		Bases on the access order the elements will be deleted.



		lhm.put(1, "A");
		lhm.put(2, "B");
		lhm.put(3, "C");
		lhm.put(4, "D");
		lhm.put(4, "E");
		lhm.put(5, "F");
//		lhm.put(6, "G");
//		lhm.put(9, "H");
//		lhm.put(8, "I");
//		System.out.println(lhm);

		System.out.println(lhm.get(2));
		System.out.println(lhm.get(5));

		System.out.println(lhm);

	}
}
